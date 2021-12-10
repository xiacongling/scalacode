package me.xiacongling.code.scala.leet.k0.h3

import me.xiacongling.code.scala.leet.{Difficulty, Solution}

object s0380_0389 {
  @Solution(id = 383, title = "赎金信", difficulty = Difficulty.Easy, description =
    """为了不在赎金信中暴露字迹，从杂志上搜索各个需要的字母，组成单词来表达意思。
      |
      |给你一个赎金信 (ransomNote) 字符串和一个杂志 (magazine) 字符串，判断 ransomNote 能不能
      |由 magazines 里面的字符构成。如果可以构成，返回 true；否则返回 false。
      |
      |magazine 中的每个字符只能在 ransomNote 中使用一次。
      |
      |示例 1：
      |输入：ransomNote = "a", magazine = "b"
      |输出：false
      |
      |示例 2：
      |输入：ransomNote = "aa", magazine = "ab"
      |输出：false
      |
      |示例 3：
      |输入：ransomNote = "aa", magazine = "aab"
      |输出：true
      |
      |提示：
      |* 1 <= ransomNote.length, magazine.length <= 10^5
      |* ransomNote 和 magazine 由小写英文字母组成
      |
      |来源：力扣（LeetCode）
      |链接：https://leetcode-cn.com/problems/ransom-note
      |著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
      |""".stripMargin)
  def canConstruct(ransomNote: String, magazine: String): Boolean = {
    val cnt: Array[Int] = Array.fill(26)(0)
    magazine.foreach(it => cnt(it - 'a') += 1)
    ransomNote.foreach(it => cnt(it - 'a') -= 1)
    cnt.forall(_ >= 0)
  }
}
