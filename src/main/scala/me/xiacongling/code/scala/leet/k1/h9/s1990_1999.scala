package me.xiacongling.code.scala.leet.k1.h9

import me.xiacongling.code.scala.leet.{Difficulty, Solution}

object s1990_1999 {
  @Solution(id = 1995, title = "统计特殊四元组", difficulty = Difficulty.Easy, description =
    """给你一个下标从 0 开始 的整数数组 nums ，返回满足下述条件的不同四元组 (a, b, c, d) 的 数目 ：
      |
      |* nums[a] + nums[b] + nums[c] == nums[d] ，且
      |* a < b < c < d
      |
      |示例 1：
      |输入：nums = [1,2,3,6]
      |输出：1
      |解释：满足要求的唯一一个四元组是 (0, 1, 2, 3) 因为 1 + 2 + 3 == 6 。
      |
      |示例 2：
      |输入：nums = [3,3,6,4,5]
      |输出：0
      |解释：[3,3,6,4,5] 中不存在满足要求的四元组。
      |
      |示例 3：
      |输入：nums = [1,1,1,3,5]
      |输出：4
      |解释：满足要求的 4 个四元组如下：
      |- (0, 1, 2, 3): 1 + 1 + 1 == 3
      |- (0, 1, 3, 4): 1 + 1 + 3 == 5
      |- (0, 2, 3, 4): 1 + 1 + 3 == 5
      |- (1, 2, 3, 4): 1 + 1 + 3 == 5
      |  
      |提示：
      |* 4 <= nums.length <= 50
      |* 1 <= nums[i] <= 100
      |
      |来源：力扣（LeetCode）
      |链接：https://leetcode-cn.com/problems/count-special-quadruplets
      |著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
      |""".stripMargin)
  def countQuadruplets(nums: Array[Int]): Int = {
    val n: Int = nums.length
    var cnt: Int = 0
    for (i <- 0 until n - 3) {
      for (j <- i + 1 until n - 2) {
        for (k <- j + 1 until n - 1) {
          for (t <- k + 1 until n) {
            if (nums(t) == nums(i) + nums(j) + nums(k))
              cnt += 1
          }
        }
      }
    }
    cnt
  }
}
