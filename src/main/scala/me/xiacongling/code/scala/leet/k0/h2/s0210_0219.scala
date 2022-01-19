package me.xiacongling.code.scala.leet.k0.h2

import me.xiacongling.code.scala.leet.{Difficulty, Solution}

import scala.collection.mutable

object s0210_0219 {
  @Solution(id = 219, title = "存在重复元素II", difficulty = Difficulty.Easy, description =
    """给你一个整数数组 nums 和一个整数 k ，判断数组中是否存在两个 不同的索引 i 和 j，
      |满足 nums[i] == nums[j] 且 abs(i - j) <= k。如果存在，返回 true；否则，返回 false。
      |
      |示例 1：
      |输入：nums = [1,2,3,1], k = 3
      |输出：true
      |
      |示例 2：
      |输入：nums = [1,0,1,1], k = 1
      |输出：true
      |
      |示例 3：
      |输入：nums = [1,2,3,1,2,3], k = 2
      |输出：false
      |
      |提示：
      |* 1 <= nums.length <= 10^5
      |* -10^9 <= nums[i] <= 10^9
      |* 0 <= k <= 10^5
      |
      |来源：力扣（LeetCode）
      |链接：https://leetcode-cn.com/problems/contains-duplicate-ii
      |著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
      |""".stripMargin)
  def containsNearbyDuplicate(nums: Array[Int], k: Int): Boolean = {
    val tmp: mutable.HashSet[Int] = mutable.HashSet()
    val (firstK, tail) = nums.splitAt(k + 1)
    firstK.exists(!tmp.add(_)) ||
      tail.zipWithIndex.exists { case (v, i) =>
        tmp.remove(nums(i))
        !tmp.add(v)
      }
  }
}
