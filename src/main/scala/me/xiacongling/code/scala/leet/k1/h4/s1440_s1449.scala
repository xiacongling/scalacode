package me.xiacongling.code.scala.leet.k1.h4

import me.xiacongling.code.scala.leet.{Difficulty, Solution}

object s1440_s1449 {
  @Solution(id = 1446, title = "连续字符", difficulty = Difficulty.Easy, description =
    """给你一个字符串 s ，字符串的「能量」定义为：只包含一种字符的最长非空子字符串的长度。
      |请你返回字符串的能量。
      |
      |示例 1：
      |输入：s = "leetcode"
      |输出：2
      |解释：子字符串 "ee" 长度为 2 ，只包含字符 'e' 。
      |
      |示例 2：
      |输入：s = "abbcccddddeeeeedcba"
      |输出：5
      |解释：子字符串 "eeeee" 长度为 5 ，只包含字符 'e' 。
      |
      |示例 3：
      |输入：s = "triplepillooooow"
      |输出：5
      |
      |示例 4：
      |输入：s = "hooraaaaaaaaaaay"
      |输出：11
      |
      |示例 5：
      |输入：s = "tourist"
      |输出：1
      |
      |提示：
      |* 1 <= s.length <= 500
      |* s 只包含小写英文字母。
      |
      |来源：力扣（LeetCode）
      |链接：https://leetcode-cn.com/problems/consecutive-characters
      |著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
      |""".stripMargin
  )
  def maxPower(s: String): Int = {
    var cnt: Int = 0
    var prev: Char = '^'
    var result: Int = 0
    for (c <- s) {
      result = result.max(cnt)
      cnt = if (c == prev) cnt + 1 else 1
      prev = c
    }
    result.max(cnt)
  }
}