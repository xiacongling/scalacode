package me.xiacongling.code.scala.leet.k0.h6

import me.xiacongling.code.scala.leet.k0.h6.s0680_0689.{maxSumOfThreeSubarrays, repeatedStringMatch}
import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class s0680_0689Test extends AnyFunSuite with should.Matchers {
  test("Test Cases for # 686") {
    repeatedStringMatch("abcd", "cdabcdab") should be(3)
    repeatedStringMatch("a", "aa") should be(2)
    repeatedStringMatch("aaa", "a") should be(1)
    repeatedStringMatch("aa", "aaa") should be(2)
    repeatedStringMatch("ab", "a") should be(1)
    repeatedStringMatch("a", "a") should be(1)
    repeatedStringMatch("abc", "wxyz") should be(-1)
  }

  test("Test Cases for #689") {
    maxSumOfThreeSubarrays(Array(1, 2, 1, 2, 6, 7, 5, 1), 2) should be(Array(0, 3, 5))
    maxSumOfThreeSubarrays(Array(1, 2, 1, 2, 1, 2, 1, 2, 1), 2) should be(Array(0, 2, 4))
  }
}
