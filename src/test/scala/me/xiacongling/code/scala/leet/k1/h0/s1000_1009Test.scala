package me.xiacongling.code.scala.leet.k1.h0

import me.xiacongling.code.scala.leet.k1.h0.s1000_1009.largestSumAfterKNegations
import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class s1000_1009Test extends AnyFunSuite with should.Matchers {
  test("Test cases for 1004") {
    largestSumAfterKNegations(Array(-4, -2, -3), 4) should be(5)
    largestSumAfterKNegations(Array(-2, 5, 0, 2, -2), 3) should be(11)
    largestSumAfterKNegations(Array(-8, 3, -5, -3, -5, -2), 6) should be(22)
    largestSumAfterKNegations(Array(4, 2, 3), 1) should be(5)
    largestSumAfterKNegations(Array(3, -1, 0, 2), 3) should be(6)
    largestSumAfterKNegations(Array(2, -3, -1, 5, -4), 2) should be(13)
  }
}
