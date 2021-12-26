package me.xiacongling.code.scala.leet.k1.h6

import me.xiacongling.code.scala.leet.{Difficulty, Solution}

object s1600_1610 {
  class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
    var value: Int = _value
    var left: TreeNode = _left
    var right: TreeNode = _right

    override def toString: String = String.valueOf(value)
  }

  object TreeNode {
    def apply(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null): TreeNode = new TreeNode(_value, _left, _right)
  }

  @Solution(id = 1609, title = "奇偶树", difficulty = Difficulty.Medium, description =
    """如果一棵二叉树满足下述几个条件，则可以称为 奇偶树 ：
      |
      |* 二叉树根节点所在层下标为 0 ，根的子节点所在层下标为 1 ，根的孙节点所在层下标为 2 ，依此类推。
      |* 偶数下标 层上的所有节点的值都是 奇 整数，从左到右按顺序 严格递增
      |* 奇数下标 层上的所有节点的值都是 偶 整数，从左到右按顺序 严格递减
      |
      |给你二叉树的根节点，如果二叉树为 奇偶树 ，则返回 true ，否则返回 false 。
      |
      |示例 1：
      |输入：root = [1,10,4,3,null,7,9,12,8,6,null,null,2]
      |输出：true
      |解释：每一层的节点值分别是：
      |0 层：[1]
      |1 层：[10,4]
      |2 层：[3,7,9]
      |3 层：[12,8,6,2]
      |由于 0 层和 2 层上的节点值都是奇数且严格递增，而 1 层和 3 层上的节点值都是偶数且严格递减，因此这是一棵奇偶树。
      |
      |示例 2：
      |输入：root = [5,4,2,3,3,7]
      |输出：false
      |解释：每一层的节点值分别是：
      |0 层：[5]
      |1 层：[4,2]
      |2 层：[3,3,7]
      |2 层上的节点值不满足严格递增的条件，所以这不是一棵奇偶树。
      |
      |示例 3：
      |输入：root = [5,9,1,3,5,7]
      |输出：false
      |解释：1 层上的节点值应为偶数。
      |
      |示例 4：
      |输入：root = [1]
      |输出：true
      |
      |示例 5：
      |输入：root = [11,8,6,1,3,9,11,30,20,18,16,12,10,4,2,17]
      |输出：true
      |
      |提示：
      |* 树中节点数在范围 [1, 10^5] 内
      |* 1 <= Node.val <= 10^6
      |
      |来源：力扣（LeetCode）
      |链接：https://leetcode-cn.com/problems/even-odd-tree
      |著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
      |""".stripMargin)
  def isEvenOddTree(root: TreeNode): Boolean = {
    if (root == null) {
      return true
    }
    var level: Array[TreeNode] = Array(root)
    var oe: Int = 0
    while (level.nonEmpty) {
      var pre: Int = if (oe == 0) 0 else Int.MaxValue
      for (elem <- level) {
        val v: Int = elem.value
        if (oe == 0 && (v % 2 != 1 || v <= pre)) {
          return false
        }
        if (oe == 1 && (v % 2 != 0 || v >= pre)) {
          return false
        }
        pre = v
      }
      level = level.flatMap(p => Seq(p.left, p.right).filter(_ != null))
      oe = (oe + 1) % 2
    }
    true
  }
}
