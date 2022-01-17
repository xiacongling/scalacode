package me.xiacongling.code.scala.leet.k0.h3

import me.xiacongling.code.scala.leet
import me.xiacongling.code.scala.leet.Difficulty

import scala.util.Random

object s0380_0389 {
  class ListNode(_x: Int = 0, _next: ListNode = null) {
    var next: ListNode = _next
    var x: Int = _x
  }

  @leet.Solution(id = 382, title = "链表随机节点", difficulty = Difficulty.Medium, description =
    """给你一个单链表，随机选择链表的一个节点，并返回相应的节点值。每个节点 被选中的概率一样 。
      |
      |实现 Solution 类：
      |
      |* Solution(ListNode head) 使用整数数组初始化对象。
      |* int getRandom() 从链表中随机选择一个节点并返回该节点的值。链表中所有节点被选中的概率相等。
      |
      |示例：
      |
      |输入
      |["Solution", "getRandom", "getRandom", "getRandom", "getRandom", "getRandom"]
      |[[[1, 2, 3]], [], [], [], [], []]
      |输出
      |[null, 1, 3, 2, 2, 3]
      |
      |解释
      |Solution solution = new Solution([1, 2, 3]);
      |solution.getRandom(); // 返回 1
      |solution.getRandom(); // 返回 3
      |solution.getRandom(); // 返回 2
      |solution.getRandom(); // 返回 2
      |solution.getRandom(); // 返回 3
      |// getRandom() 方法应随机返回 1、2、3中的一个，每个元素被返回的概率相等。
      | 
      |
      |提示：
      |* 链表中的节点数在范围 [1, 10^4] 内
      |* -10^4 <= Node.val <= 10^4
      |* 至多调用 getRandom 方法 10^4 次
      |
      |进阶：
      |* 如果链表非常大且长度未知，该怎么处理？
      |* 你能否在不使用额外空间的情况下解决此问题？
      |
      |来源：力扣（LeetCode）
      |链接：https://leetcode-cn.com/problems/linked-list-random-node
      |著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
      |""".stripMargin)
  class Solution(_head: ListNode) {
    def getRandom: Int = {
      var result: Int = 0
      var i: Int = 1
      var p: ListNode = _head
      while (p != null) {
        if (Random.nextInt(i) == 0) result = p.x
        i += 1
        p = p.next
      }
      result
    }
  }

  @leet.Solution(id = 383, title = "赎金信", difficulty = Difficulty.Easy, description =
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
