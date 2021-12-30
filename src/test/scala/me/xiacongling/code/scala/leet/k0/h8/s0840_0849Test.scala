package me.xiacongling.code.scala.leet.k0.h8

import me.xiacongling.code.scala.leet.k0.h8.s0840_0849.isNStraightHand
import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class s0840_0849Test extends AnyFunSuite with should.Matchers {
  test("Test Cases for #846") {
    isNStraightHand(Array(1, 2, 3, 6, 2, 3, 4, 7, 8), 3) shouldBe true
    isNStraightHand(Array(1, 2, 3, 4, 5), 4) shouldBe false
  }
}
