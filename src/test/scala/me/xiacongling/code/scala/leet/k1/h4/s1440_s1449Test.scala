package me.xiacongling.code.scala.leet.k1.h4

import me.xiacongling.code.scala.leet.k1.h4.s1440_s1449.maxPower
import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class s1440_s1449Test extends AnyFunSuite with should.Matchers {
  test("Test Cases for #1446") {
    maxPower("leetcode") should be (2)
    maxPower("abbcccddddeeeeedcba") should be (5)
    maxPower("triplepillooooow") should be (5)
    maxPower("hooraaaaaaaaaaay") should be (11)
    maxPower("tourist") should be (1)
  }
}
