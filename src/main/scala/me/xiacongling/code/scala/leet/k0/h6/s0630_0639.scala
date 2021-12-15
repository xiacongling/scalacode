package me.xiacongling.code.scala.leet.k0.h6

import me.xiacongling.code.scala.leet.{Difficulty, Solution}

import scala.collection.mutable

object s0630_0639 {
  @Solution(id = 630, title = "课程表III", difficulty = Difficulty.Hard, description =
    """这里有 n 门不同的在线课程，按从 1 到 n 编号。给你一个数组 courses，其中
      |courses[i] = [duration_i, lastDay_i] 表示第 i 门课将会持续上 duration_i 天课，
      |并且必须在不晚于 lastDay_i 的时候完成。
      |
      |你的学期从第 1 天开始。且不能同时修读两门及两门以上的课程。
      |
      |返回你最多可以修读的课程数目。
      |
      |示例 1：
      |输入：courses = [[100, 200], [200, 1300], [1000, 1250], [2000, 3200]]
      |输出：3
      |解释：
      |这里一共有 4 门课程，但是你最多可以修 3 门：
      |首先，修第 1 门课，耗费 100 天，在第 100 天完成，在第 101 天开始下门课。
      |第二，修第 3 门课，耗费 1000 天，在第 1100 天完成，在第 1101 天开始下门课程。
      |第三，修第 2 门课，耗时 200 天，在第 1300 天完成。
      |第 4 门课现在不能修，因为将会在第 3300 天完成它，这已经超出了关闭日期。
      |
      |示例 2：
      |输入：courses = [[1,2]]
      |输出：1
      |
      |示例 3：
      |输入：courses = [[3,2],[4,3]]
      |输出：0
      | 
      |提示:
      |* 1 <= courses.length <= 10^4
      |* 1 <= duration_i, lastDay_i <= 10^4
      |
      |来源：力扣（LeetCode）
      |链接：https://leetcode-cn.com/problems/course-schedule-iii
      |著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
      |""".stripMargin)
  def scheduleCourse(courses: Array[Array[Int]]): Int = {
    val sorted: Array[Array[Int]] = courses.sortBy(_ (1))
    val q: mutable.PriorityQueue[Integer] = mutable.PriorityQueue()
    var total: Int = 0
    for (course <- sorted) {
      val ti: Int = course(0)
      val di: Int = course(1)
      if (total + ti <= di) {
        total += ti
        q += ti
      } else if (q.nonEmpty && q.head > ti) {
        total -= q.dequeue() - ti
        q += ti
      }
    }
    q.size
  }
}
