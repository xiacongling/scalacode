package me.xiacongling.code.scala.leet.k0.h3

import me.xiacongling.code.scala.leet.k0.h3.s0330_0339.increasingTriplet
import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class s0330_0339Test extends AnyFunSuite with should.Matchers {
  test("Test Cases for #334") {
    increasingTriplet(Array(1, 2, 3, 4, 5)) shouldBe true
    increasingTriplet(Array(5, 4, 3, 2, 1)) shouldBe false
    increasingTriplet(Array(2, 1, 5, 0, 6)) shouldBe true
    increasingTriplet(Array(2, 1, 5, 0, 4, 6)) shouldBe true
    increasingTriplet(Array(2, 1, 5, 0, 3, 4)) shouldBe true
    increasingTriplet(Array(1, 5, 0, 4, 1, 3)) shouldBe true
  }
}
