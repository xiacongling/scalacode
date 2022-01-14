package me.xiacongling.code.scala.leet.k0.h3

import me.xiacongling.code.scala.leet.{Difficulty, Solution}

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object s0370_0379 {
  @Solution(id = 372, title = "超级次方", difficulty = Difficulty.Medium, description =
    """你的任务是计算 ab 对 1337 取模，a 是一个正整数，b 是一个非常大的正整数且会以数组形式给出。
      |
      |示例 1：
      |输入：a = 2, b = [3]
      |输出：8
      |
      |示例 2：
      |输入：a = 2, b = [1,0]
      |输出：1024
      |
      |示例 3：
      |输入：a = 1, b = [4,3,3,8,5,2]
      |输出：1
      |
      |示例 4：
      |输入：a = 2147483647, b = [2,0,0]
      |输出：1198
      |
      |提示：
      |* 1 <= a <= 2^31 - 1
      |* 1 <= b.length <= 2000
      |* 0 <= b[i] <= 9
      |* b 不含前导 0
      |
      |来源：力扣（LeetCode）
      |链接：https://leetcode-cn.com/problems/super-pow
      |著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
      |""".stripMargin)
  def superPow(a: Int, b: Array[Int]): Int = {
    val m: Long = 1337L

    def pow(base: Int, exp: Int): Int = {
      if (base != 0) {
        var b: Int = base
        var e: Int = exp
        var res: Int = 1
        while (e != 0) {
          if (e % 2 != 0) {
            res = (res.longValue() * b % m).intValue()
          }
          b = (b.longValue() * b % m).intValue()
          e /= 2
        }
        res
      } else {
        0
      }
    }

    var t: Int = a
    var ans: Int = 1
    for (e <- b.reverse) {
      ans = (ans.longValue() * pow(t, e) % m).intValue()
      t = pow(t, 10)
    }
    ans
  }

  @Solution(id = 373, title = "查找和最小的 K 对数字", difficulty = Difficulty.Medium, description =
    """给定两个以升序排列的整数数组 nums1 和 nums2 , 以及一个整数 k 。
      |
      |定义一对值 (u,v)，其中第一个元素来自 nums1，第二个元素来自 nums2 。
      |
      |请找到和最小的 k 个数对 (u1,v1),  (u2,v2)  ...  (uk,vk) 。
      |
      |示例 1:
      |输入: nums1 = [1,7,11], nums2 = [2,4,6], k = 3
      |输出: [1,2],[1,4],[1,6]
      |解释: 返回序列中的前 3 对数：
      |     [1,2],[1,4],[1,6],[7,2],[7,4],[11,2],[7,6],[11,4],[11,6]
      |
      |示例 2:
      |输入: nums1 = [1,1,2], nums2 = [1,2,3], k = 2
      |输出: [1,1],[1,1]
      |解释: 返回序列中的前 2 对数：
      |     [1,1],[1,1],[1,2],[2,1],[1,2],[2,2],[1,3],[1,3],[2,3]
      |
      |示例 3:
      |输入: nums1 = [1,2], nums2 = [3], k = 3
      |输出: [1,3],[2,3]
      |解释: 也可能序列中所有的数对都被返回:[1,3],[2,3]
      |
      |提示:
      |* 1 <= nums1.length, nums2.length <= 10^4
      |* -10^9 <= nums1[i], nums2[i] <= 10^9
      |* nums1, nums2 均为升序排列
      |* 1 <= k <= 1000
      |
      |来源：力扣（LeetCode）
      |链接：https://leetcode-cn.com/problems/find-k-pairs-with-smallest-sums
      |著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
      |""".stripMargin)
  def kSmallestPairs(nums1: Array[Int], nums2: Array[Int], k: Int): List[List[Int]] = {
    val pq: mutable.PriorityQueue[(Int, Int, Int)] = mutable.PriorityQueue()(Ordering.by(-_._1))
    val result: ListBuffer[List[Int]] = ListBuffer()
    Range(0, nums1.length.min(k)).foreach(i => pq.addOne((nums1(i) + nums2(0), i, 0)))

    var t: Int = 0
    while (t < k && pq.nonEmpty) {
      val (_, i, j) = pq.dequeue()
      result += List(nums1(i), nums2(j))
      if (j + 1 < nums2.length) pq.addOne((nums1(i) + nums2(j + 1), i, j + 1))
      t += 1
    }
    result.toList
  }
}
