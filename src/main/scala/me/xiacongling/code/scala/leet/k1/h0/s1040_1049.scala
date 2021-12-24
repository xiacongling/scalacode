package me.xiacongling.code.scala.leet.k1.h0

import me.xiacongling.code.scala.leet.{Difficulty, Solution}

object s1040_1049 {
  @Solution(id = 1044, title = "最长重复子串", difficulty = Difficulty.Hard, description =
    """给你一个字符串 s，考虑其所有重复子串：即，s 的连续子串在 s 中出现 2 次或更多次。
      |这些出现之间可能存在重叠。
      |
      |返回任意一个可能具有最长长度的重复子串。如果 s 不含重复子串，那么答案为 "" 。
      |
      |示例 1：
      |输入：s = "banana"
      |输出："ana"
      |
      |示例 2：
      |输入：s = "abcd"
      |输出：""
      |
      |提示：
      |* 2 <= s.length <= 3 * 10^4
      |* s 由小写英文字母组成
      |
      |来源：力扣（LeetCode）
      |链接：https://leetcode-cn.com/problems/longest-duplicate-substring
      |著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。""".stripMargin)
  def longestDupSubstring(s: String): String = {
    def tleSolution(): String = {
      var result: String = ""
      for (i <- s.indices) {
        val tail: String = s.substring(i + 1)
        result = (i + result.length + 1 to s.length)
          .map(s.substring(i, _))
          .takeWhile(tail contains _)
          .lastOption
          .getOrElse(result)
      }
      result
    }

    // Using Rabin-Karp's Algo
    "0"
  }
}
