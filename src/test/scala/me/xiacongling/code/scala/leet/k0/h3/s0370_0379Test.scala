package me.xiacongling.code.scala.leet.k0.h3

import me.xiacongling.code.scala.leet.k0.h3.s0370_0379.{kSmallestPairs, superPow}
import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class s0370_0379Test extends AnyFunSuite with should.Matchers {
  test("Test Cases for #372") {
    superPow(2, Array(3)) should be(8)
    superPow(2, Array(1, 0)) should be(1024)
    superPow(1, Array(4, 3, 3, 8, 5, 2)) should be(1)
    superPow(2147483647, Array(2, 0, 0)) should be(1198)
  }

  test("Test Cases for #373") {
    kSmallestPairs(Array(1, 7, 11), Array(2, 4, 6), 3) shouldBe List(List(1, 2), List(1, 4), List(1, 6))
    kSmallestPairs(Array(1, 1, 2), Array(1, 2, 3), 2) shouldBe List(List(1, 1), List(1, 1))
    kSmallestPairs(Array(1, 2), Array(3), 3) shouldBe List(List(1, 3), List(2, 3))
  }
}
