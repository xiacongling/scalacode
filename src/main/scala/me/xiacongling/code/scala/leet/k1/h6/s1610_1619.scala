package me.xiacongling.code.scala.leet.k1.h6

import me.xiacongling.code.scala.leet.{Difficulty, Solution}

import scala.collection.mutable

object s1610_1619 {
  @Solution(id = 1610, title = "可见点的最大数目", difficulty = Difficulty.Hard, description =
    """给你一个点数组 points 和一个表示角度的整数 angle，你的位置是 location，
      |其中 location = [posx, posy] 且 points[i] = [xi, yi] 都表示 X-Y 平面上的整数坐标。
      |
      |最开始，你面向东方进行观测。你 不能 进行移动改变位置，但可以通过 自转 调整观测角度。
      |换句话说，posx 和 posy 不能改变。你的视野范围的角度用 angle 表示，这决定了你观测任意方向时
      |可以多宽。设 d 为你逆时针自转旋转的度数，那么你的视野就是角度范围
      |[d - angle/2, d + angle/2] 所指示的那片区域。
      |
      |对于每个点，如果由该点、你的位置以及从你的位置直接向东的方向形成的角度位于你的视野中，
      |那么你就可以看到它。
      |
      |同一个坐标上可以有多个点。你所在的位置也可能存在一些点，但不管你的怎么旋转，
      |总是可以看到这些点。同时，点不会阻碍你看到其他点。
      |
      |返回你能看到的点的最大数目。
      |
      |示例 1：
      |输入：points = [[2,1],[2,2],[3,3]], angle = 90, location = [1,1]
      |输出：3
      |解释：阴影区域代表你的视野。在你的视野中，所有的点都清晰可见，尽管 [2,2] 和 [3,3]在同一条直线上，你仍然可以看到 [3,3] 。
      |
      |示例 2：
      |输入：points = [[2,1],[2,2],[3,4],[1,1]], angle = 90, location = [1,1]
      |输出：4
      |解释：在你的视野中，所有的点都清晰可见，包括你所在位置的那个点。
      |
      |示例 3：
      |输入：points = [[1,0],[2,1]], angle = 13, location = [1,1]
      |输出：1
      |解释：如图所示，你只能看到两点之一。
      | 
      |提示：
      |* 1 <= points.length <= 10^5
      |* points[i].length == 2
      |* location.length == 2
      |* 0 <= angle < 360
      |* 0 <= posx, posy, xi, yi <= 100
      |
      |来源：力扣（LeetCode）
      |链接：https://leetcode-cn.com/problems/maximum-number-of-visible-points
      |著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
      |""".stripMargin)
  def visiblePoints(points: List[List[Int]], angle: Int, location: List[Int]): Int = {
    def angleOf(p: List[Int]): Double = {
      val x: Double = (p.head - location.head)
      val y: Double = (p.last - location.last)
      if (x == 0 && y == 0) {
        Double.NaN
      } else {
        val alpha: Double = math.atan2(y, x)
        if (alpha >= 0) {
          180D * math.atan2(y, x) / math.Pi
        } else {
          360D + 180D * math.atan2(y, x) / math.Pi
        }
      }
    }

    val circle: mutable.TreeMap[Double, Int] = mutable.TreeMap()
    points.foreach(point => {
      circle.updateWith(angleOf(point))(o => Some(o.getOrElse(0) + 1))
    })
    val heart: Int = circle.remove(Double.NaN).getOrElse(0)
    var sumUp: Int = 0
    circle.mapValuesInPlace((_, v) => {
      sumUp += v
      sumUp
    })
    heart + circle.keysIterator.map(start => {
      val end: Double = start + angle
      if (end < 360D) {
        circle.getOrElse(end, circle.maxBefore(end).get._2) - circle.maxBefore(start).getOrElse((0, 0))._2
      } else {
        circle.maxBefore(360D).get._2 - circle.maxBefore(start).getOrElse((0, 0))._2 +
          circle.getOrElse(end - 360D, circle.maxBefore(end - 360D).getOrElse((0, 0))._2)
      }
    }).maxOption.getOrElse(0)
  }

  @Solution(id= 1614, title = "括号的最大嵌套深度", difficulty = Difficulty.Easy, description =
    """如果字符串满足以下条件之一，则可以称之为 有效括号字符串（valid parentheses string，可以简写为 VPS）：
      |
      |* 字符串是一个空字符串 ""，或者是一个不为 "(" 或 ")" 的单字符。
      |* 字符串可以写为 AB（A 与 B 字符串连接），其中 A 和 B 都是 有效括号字符串 。
      |* 字符串可以写为 (A)，其中 A 是一个 有效括号字符串 。
      |
      |类似地，可以定义任何有效括号字符串 S 的 嵌套深度 depth(S)：
      |
      |* depth("") = 0
      |* depth(C) = 0，其中 C 是单个字符的字符串，且该字符不是 "(" 或者 ")"
      |* depth(A + B) = max(depth(A), depth(B))，其中 A 和 B 都是 有效括号字符串
      |* depth("(" + A + ")") = 1 + depth(A)，其中 A 是一个 有效括号字符串
      |
      |例如：""、"()()"、"()(()())" 都是有效括号字符串（嵌套深度分别为 0、1、2），而 ")(" 、"(()" 都不是有效括号字符串。
      |
      |给你一个 有效括号字符串 s，返回该字符串的 s 嵌套深度 。
      |
      |示例 1：
      |输入：s = "(1+(2*3)+((8)/4))+1"
      |输出：3
      |解释：数字 8 在嵌套的 3 层括号中。
      |
      |示例 2：
      |输入：s = "(1)+((2))+(((3)))"
      |输出：3
      |
      |示例 3：
      |输入：s = "1+(2*3)/(2-1)"
      |输出：1
      |
      |示例 4：
      |输入：s = "1"
      |输出：0
      |
      |提示：
      |* 1 <= s.length <= 100
      |* s 由数字 0-9 和字符 '+'、'-'、'*'、'/'、'('、')' 组成
      |* 题目数据保证括号表达式 s 是 有效的括号表达式
      |
      |来源：力扣（LeetCode）
      |链接：https://leetcode-cn.com/problems/maximum-nesting-depth-of-the-parentheses
      |著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
      |""".stripMargin)
  def maxDepth(s: String): Int = {
    var d: Int = 0
    var maxD: Int = 0
    s.foreach {
      case '(' =>
        d += 1
        maxD = maxD.max(d)
      case ')' =>
        d = 0.max(d - 1)
      case _ => // do nothing
    }
    maxD
  }
}
