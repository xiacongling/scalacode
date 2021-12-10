package me.xiacongling.code.scala.leet.k0.h7

import me.xiacongling.code.scala.leet.k0.h7.s0790_0799.validTicTacToe
import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class s0790_0799Test extends AnyFunSuite with should.Matchers {
  test("Test Cases for #794") {
    validTicTacToe(
      Array(
        "XXO",
        "XOX",
        "OXO")
    ) should be(false)
    validTicTacToe(
      Array(
        "O  ",
        "   ",
        "   ")
    ) should be(false)
    validTicTacToe(
      Array(
        "XOX",
        " X ",
        "   ")
    ) should be(false)
    validTicTacToe(
      Array(
        "XXX",
        "   ",
        "OOO")
    ) should be(false)
    validTicTacToe(
      Array(
        "XOX",
        "O O",
        "XOX")
    ) should be(true)
  }

}
