package me.xiacongling.code.scala.leet.k0.h7

import me.xiacongling.code.scala.leet.{Difficulty, Solution}

object s0740_0749 {
  @Solution(id = 747, title = "至少是其他数字两倍的最大数", difficulty = Difficulty.Easy, description =
    """给你一个整数数组 nums ，其中总是存在唯一的一个最大整数 。
      |
      |请你找出数组中的最大元素并检查它是否至少是数组中每个其他数字的两倍。如果是，则返回最大元素的下标，否则返回 -1 。
      |
      |示例 1：
      |输入：nums = [3,6,1,0]
      |输出：1
      |解释：6 是最大的整数，对于数组中的其他整数，6 大于数组中其他元素的两倍。6 的下标是1 ，所以返回 1。
      |
      |示例 2：
      |输入：nums = [1,2,3,4]
      |输出：-1
      |解释：4 没有超过 3 的两倍大，所以返回 -1 。
      |
      |示例 3：
      |输入：nums = [1]
      |输出：0
      |解释：因为不存在其他数字，所以认为现有数字 1 至少是其他数字的两倍。
      |
      |提示：
      |* 1 <= nums.length <= 50
      |* 0 <= nums[i] <= 100
      |* nums 中的最大元素是唯一的
      |
      |来源：力扣（LeetCode）
      |链接：https://leetcode-cn.com/problems/largest-number-at-least-twice-of-others
      |著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
      |""".stripMargin)
  def dominantIndex(nums: Array[Int]): Int = {
    if (nums.length < 1) return -1
    if (nums.length == 1) return 0
    var max: Int = nums(0)
    var maxi: Int = 0
    var smax: Int = Int.MinValue
    nums.zipWithIndex.tail.foreach { case (v, i) =>
      if (v > max) {
        smax = max
        max = v
        maxi = i
      } else if (v > smax) {
        smax = v
      }
    }
    if (max >= smax * 2) maxi else -1
  }

  @Solution(id = 748, title = "最短补全词", difficulty = Difficulty.Easy, description =
    """给你一个字符串 licensePlate 和一个字符串数组 words ，请你找出并返回 words 中的 最短补全词 。
      |
      |补全词 是一个包含 licensePlate 中所有的字母的单词。在所有补全词中，最短的那个就是 最短补全词 。
      |
      |在匹配 licensePlate 中的字母时：
      |* 忽略 licensePlate 中的 数字和空格 。
      |* 不区分大小写。
      |* 如果某个字母在 licensePlate 中出现不止一次，那么该字母在补全词中的出现次数应当一致或者更多。
      |
      |例如：licensePlate = "aBc 12c"，那么它的补全词应当包含字母 'a'、'b' （忽略大写）和两个 'c'。
      |可能的 补全词 有 "abccdef"、"caaacab" 以及 "cbca" 。
      |
      |请你找出并返回 words 中的最短补全词。题目数据保证一定存在一个最短补全词。
      |当有多个单词都符合最短补全词的匹配条件时取 words 中 最靠前的 那个。
      |
      |示例 1：
      |输入：licensePlate = "1s3 PSt", words = ["step", "steps", "stripe", "stepple"]
      |输出："steps"
      |解释：最短补全词应该包括 "s"、"p"、"s"（忽略大小写） 以及 "t"。
      |"step" 包含 "t"、"p"，但只包含一个 "s"，所以它不符合条件。
      |"steps" 包含 "t"、"p" 和两个 "s"。
      |"stripe" 缺一个 "s"。
      |"stepple" 缺一个 "s"。
      |因此，"steps" 是唯一一个包含所有字母的单词，也是本例的答案。
      |
      |示例 2：
      |输入：licensePlate = "1s3 456", words = ["looks", "pest", "stew", "show"]
      |输出："pest"
      |解释：licensePlate 只包含字母 "s" 。所有的单词都包含字母 "s" ，其中 "pest"、"stew"、和 "show" 三者最短。答案是 "pest" ，因为它是三个单词中在 words 里最靠前的那个。
      |
      |示例 3：
      |输入：licensePlate = "Ah71752", words = ["suggest","letter","of","husband","easy","education","drug","prevent","writer","old"]
      |输出："husband"
      |
      |示例 4：
      |输入：licensePlate = "OgEu755", words = ["enough","these","play","wide","wonder","box","arrive","money","tax","thus"]
      |输出："enough"
      |
      |示例 5：
      |输入：licensePlate = "iMSlpe4", words = ["claim","consumer","student","camera","public","never","wonder","simple","thought","use"]
      |输出："simple"
      |
      |提示：
      |* 1 <= licensePlate.length <= 7
      |* licensePlate 由数字、大小写字母或空格 ' ' 组成
      |* 1 <= words.length <= 1000
      |* 1 <= words[i].length <= 15
      |* words[i] 由小写英文字母组成
      |
      |来源：力扣（LeetCode）
      |链接：https://leetcode-cn.com/problems/shortest-completing-word
      |著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
      |""".stripMargin)
  def shortestCompletingWord(licensePlate: String, words: Array[String]): String = {
    def countLetters(word: String): Map[Char, Int] = word.toLowerCase()
      .filter(it => it.isLetter)
      .groupMapReduce(it => it)(_ => 1)(_ + _)

    val cnt: Map[Char, Int] = countLetters(licensePlate)
    words.filter(word => {
      val candidate: Map[Char, Int] = countLetters(word)
      cnt.forall(it => candidate.getOrElse(it._1, 0) - it._2 >= 0)
    }).minBy(_.length)
  }
}
