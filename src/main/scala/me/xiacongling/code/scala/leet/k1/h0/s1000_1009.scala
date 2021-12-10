package me.xiacongling.code.scala.leet.k1.h0

import me.xiacongling.code.scala.leet.{Difficulty, Solution}

object s1000_1009 {
  @Solution(id = 1005, title = "K 次取反后最大化的数组和", difficulty = Difficulty.Easy, description =
    """给你一个整数数组 nums 和一个整数 k ，按以下方法修改该数组：
      |* 选择某个下标 i 并将 nums[i] 替换为 -nums[i] 。
      |* 重复这个过程恰好 k 次。可以多次选择同一个下标 i 。
      |
      |以这种方式修改数组后，返回数组 可能的最大和 。
      |
      |示例 1：
      |输入：nums = [4,2,3], k = 1
      |输出：5
      |解释：选择下标 1 ，nums 变为 [4,-2,3] 。
      |
      |示例 2：
      |输入：nums = [3,-1,0,2], k = 3
      |输出：6
      |解释：选择下标 (1, 2, 2) ，nums 变为 [3,1,0,2] 。
      |
      |示例 3：
      |输入：nums = [2,-3,-1,5,-4], k = 2
      |输出：13
      |解释：选择下标 (1, 4) ，nums 变为 [2,3,-1,5,4] 。
      |
      |提示：
      |* 1 <= nums.length <= 10^4
      |* -100 <= nums[i] <= 100
      |* 1 <= k <= 10^4
      |
      |来源：力扣（LeetCode）
      |链接：https://leetcode-cn.com/problems/maximize-sum-of-array-after-k-negations
      |著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
      |""".stripMargin)
  def largestSumAfterKNegations(nums: Array[Int], k: Int): Int = {
    var result: Int = 0
    var n: Int = k
    var pre: Int = Int.MinValue
    for (t <- nums.sorted) {
      if (n > 0) {
        if (t < 0) {
          result -= t
          n -= 1
        } else {
          if (n % 2 == 0) {
            result += t
          } else if (pre > -t) {
            result += pre + pre + t
          } else {
            result -= t
          }
          n = 0
        }
      } else {
        result += t
      }
      pre = t
    }
    if (n % 2 == 1) {
      result += pre + pre
    }
    result
  }
}
