package me.xiacongling.code.scala.leet.k0.h5

import me.xiacongling.code.scala.leet.k0.h5.s0500_0509.{checkPerfectNumber, findRelativeRanks}
import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class s0500_0509Test extends AnyFunSuite with should.Matchers {
  test("Test Cases for #506") {
    findRelativeRanks(Array(5, 4, 3, 2, 1)) should be(Array("Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"))
    findRelativeRanks(Array(10, 3, 8, 9, 4)) should be(Array("Gold Medal", "5", "Bronze Medal", "Silver Medal", "4"))
  }

  test("Test Cases for #507") {
    checkPerfectNumber(2) shouldBe false
    checkPerfectNumber(6) shouldBe true
    checkPerfectNumber(28) shouldBe true
    checkPerfectNumber(496) shouldBe true
    checkPerfectNumber(8128) shouldBe true
  }
}
