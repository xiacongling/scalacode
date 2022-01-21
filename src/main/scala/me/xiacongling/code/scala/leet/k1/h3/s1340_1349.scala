package me.xiacongling.code.scala.leet.k1.h3

import me.xiacongling.code.scala.leet.{Difficulty, Solution}

import scala.collection.mutable

object s1340_1349 {
  @Solution(id = 1345, title = "跳跃游戏IV", difficulty = Difficulty.Hard, description =
    """给你一个整数数组 arr ，你一开始在数组的第一个元素处（下标为 0）。
      |
      |每一步，你可以从下标 i 跳到下标：
      |
      |* i + 1 满足：i + 1 < arr.length
      |* i - 1 满足：i - 1 >= 0
      |* j 满足：arr[i] == arr[j] 且 i != j
      |
      |请你返回到达数组最后一个元素的下标处所需的 最少操作次数 。
      |
      |注意：任何时候你都不能跳到数组外面。
      |
      |示例 1：
      |输入：arr = [100,-23,-23,404,100,23,23,23,3,404]
      |输出：3
      |解释：那你需要跳跃 3 次，下标依次为 0 --> 4 --> 3 --> 9 。下标 9 为数组的最后一个元素的下标。
      |
      |示例 2：
      |输入：arr = [7]
      |输出：0
      |解释：一开始就在最后一个元素处，所以你不需要跳跃。
      |
      |示例 3：
      |输入：arr = [7,6,9,6,9,6,9,7]
      |输出：1
      |解释：你可以直接从下标 0 处跳到下标 7 处，也就是数组的最后一个元素处。
      |
      |示例 4：
      |输入：arr = [6,1,9]
      |输出：2
      |示例 5：
      |
      |输入：arr = [11,22,7,7,7,7,7,7,7,22,13]
      |输出：3
      | 
      |提示：
      |* 1 <= arr.length <= 5 * 10^4
      |* -10^8 <= arr[i] <= 10^8
      |
      |来源：力扣（LeetCode）
      |链接：https://leetcode-cn.com/problems/jump-game-iv
      |著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
      |""".stripMargin)
  def minJumps(arr: Array[Int]): Int = {
    if (arr.length <= 1) return 0

    val eq: mutable.Map[Int, Array[Int]] = mutable.Map(arr.zipWithIndex.groupMap(_._1)(_._2).toSeq: _*)
    val visited: mutable.BitSet = mutable.BitSet()

    def nextIndices(idx: Int): mutable.Set[Int] = {
      val buf: mutable.HashSet[Int] = mutable.HashSet()
      if (idx + 1 < arr.length && visited.add(idx + 1)) buf.add(idx + 1)
      if (idx - 1 >= 0 && visited.add(idx - 1)) buf.add(idx - 1)
      eq.remove(arr(idx)).getOrElse(Array()).filter(visited.add).foreach(buf.add)
      buf
    }

    var next: Set[Int] = Set(0)
    var step: Int = 0
    while (next.nonEmpty) {
      if (next.contains(arr.length - 1)) return step
      step += 1
      next = next.flatMap(nextIndices)
    }
    step
  }
}
