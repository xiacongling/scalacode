package me.xiacongling.code.scala.leet.k0.h5

import me.xiacongling.code.scala.leet.{Difficulty, Solution}

object s0530_0539 {
  @Solution(id = 539, title = "最小时间差", difficulty = Difficulty.Medium, description =
    """给定一个 24 小时制（小时:分钟 "HH:MM"）的时间列表，找出列表中任意两个时间的最小时间差并以分钟数表示。
      |
      |示例 1：
      |输入：timePoints = ["23:59","00:00"]
      |输出：1
      |
      |示例 2：
      |输入：timePoints = ["00:00","23:59","00:00"]
      |输出：0
      |
      |提示：
      |* 2 <= timePoints <= 2 * 10^4
      |* timePoints[i] 格式为 "HH:MM"
      |
      |来源：力扣（LeetCode）
      |链接：https://leetcode-cn.com/problems/minimum-time-difference
      |著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
      |""".stripMargin)
  def findMinDifference(timePoints: List[String]): Int = {
    def toMin(tp: String): Int = {
      val parts: Array[String] = tp.split(":")
      parts(0).toInt * 60 + parts(1).toInt
    }

    val minutes: List[Int] = timePoints
      .map(toMin)
      .sorted
    minutes.appended(minutes.head)
      .sliding(2, 1)
      .map { case List(a, b) => (a - b).abs }
      .map(d => d.min(24 * 60 - d))
      .min
  }
}
