package me.xiacongling.code.scala.leet.k0.h3

import me.xiacongling.code.scala.leet.{Difficulty, Solution}

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
}
