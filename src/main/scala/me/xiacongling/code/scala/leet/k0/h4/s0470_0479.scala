package me.xiacongling.code.scala.leet.k0.h4

import me.xiacongling.code.scala.leet.{Difficulty, Solution}

object s0470_0479 {
  @Solution(id = 472, title = "连接词", difficulty = Difficulty.Hard, description =
    """给你一个 不含重复 单词的字符串数组 words ，请你找出并返回 words 中的所有 连接词 。
      |
      |连接词 定义为：一个完全由给定数组中的至少两个较短单词组成的字符串。
      |
      |示例 1：
      |输入：words = ["cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat","ratcatdogcat"]
      |输出：["catsdogcats","dogcatsdog","ratcatdogcat"]
      |解释："catsdogcats" 由 "cats", "dog" 和 "cats" 组成; 
      |     "dogcatsdog" 由 "dog", "cats" 和 "dog" 组成; 
      |     "ratcatdogcat" 由 "rat", "cat", "dog" 和 "cat" 组成。
      |
      |示例 2：
      |输入：words = ["cat","dog","catdog"]
      |输出：["catdog"]
      |
      |提示：
      |* 1 <= words.length <= 10^4
      |* 0 <= words[i].length <= 1000
      |* words[i] 仅由小写字母组成
      |* 0 <= sum(words[i].length) <= 10^5
      |
      |来源：力扣（LeetCode）
      |链接：https://leetcode-cn.com/problems/concatenated-words
      |著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
      |""".stripMargin)
  def findAllConcatenatedWordsInADict(words: Array[String]): List[String] = {
    List()
  }

  @Solution(id = 475, title = "供暖器", difficulty = Difficulty.Medium, description =
    """冬季已经来临。你的任务是设计一个有固定加热半径的供暖器向所有房屋供暖。
      |
      |在加热器的加热半径范围内的每个房屋都可以获得供暖。
      |
      |现在，给出位于一条水平线上的房屋 houses 和供暖器 heaters 的位置，
      |请你找出并返回可以覆盖所有房屋的最小加热半径。
      |
      |说明：所有供暖器都遵循你的半径标准，加热的半径也一样。
      |
      |示例 1:
      |输入: houses = [1,2,3], heaters = [2]
      |输出: 1
      |解释: 仅在位置2上有一个供暖器。如果我们将加热半径设为1，那么所有房屋就都能得到供暖。
      |
      |示例 2:
      |输入: houses = [1,2,3,4], heaters = [1,4]
      |输出: 1
      |解释: 在位置1, 4上有两个供暖器。我们需要将加热半径设为1，这样所有房屋就都能得到供暖。
      |
      |示例 3：
      |输入：houses = [1,5], heaters = [2]
      |输出：3
      |
      |提示：
      |* 1 <= houses.length, heaters.length <= 3 * 10^4
      |* 1 <= houses[i], heaters[i] <= 10^9
      |
      |来源：力扣（LeetCode）
      |链接：https://leetcode-cn.com/problems/heaters
      |著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
      |""".stripMargin)
  def findRadius(houses: Array[Int], heaters: Array[Int]): Int = {
    val n: Int = heaters.length
    val heaterSorted: Array[Int] = heaters.sorted
    houses.map(h => {
      val i: Int = heaterSorted.search(h).insertionPoint
      val l: Int = if (i <= 0) Int.MaxValue else h - heaterSorted(i - 1)
      val r: Int = if (i >= n) Int.MaxValue else heaterSorted(i) - h
      math.min(l, r)
    }).max
  }
}
