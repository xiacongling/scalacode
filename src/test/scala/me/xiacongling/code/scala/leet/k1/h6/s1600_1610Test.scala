package me.xiacongling.code.scala.leet.k1.h6

import me.xiacongling.code.scala.leet.k1.h6.s1600_1610.{TreeNode, isEvenOddTree}
import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class s1600_1610Test extends AnyFunSuite with should.Matchers {
  test("Test Cases for #1609") {
    isEvenOddTree(TreeNode(1,
      TreeNode(10,
        TreeNode(3, TreeNode(12), TreeNode(8))
      ),
      TreeNode(4,
        TreeNode(7, TreeNode(6)),
        TreeNode(9, null, TreeNode(2))
      )
    )) should be(true)

    isEvenOddTree(TreeNode(5,
      TreeNode(4, TreeNode(3), TreeNode(3)),
      TreeNode(2, TreeNode(7))
    )) should be(false)

    isEvenOddTree(TreeNode(5,
      TreeNode(9, TreeNode(3), TreeNode(5)),
      TreeNode(1, TreeNode(7))
    )) should be(false)
  }
}
