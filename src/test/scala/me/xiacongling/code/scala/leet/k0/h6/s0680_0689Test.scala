package me.xiacongling.code.scala.leet.k0.h6

import me.xiacongling.code.scala.leet.k0.h6.s0680_0689.maxSumOfThreeSubarrays
import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class s0680_0689Test extends AnyFunSuite with should.Matchers {
  test("Test Cases for #689") {
    maxSumOfThreeSubarrays(Array(1, 2, 1, 2, 6, 7, 5, 1), 2) should be(Array(0, 3, 5))
    maxSumOfThreeSubarrays(Array(1, 2, 1, 2, 1, 2, 1, 2, 1), 2) should be(Array(0, 2, 4))
  }
}
