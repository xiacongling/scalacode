package me.xiacongling.code.scala.leet.k1.h1

import me.xiacongling.code.scala.leet.k1.h1.s1150_1159.dayOfYear
import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class s1150_1159Test extends AnyFunSuite with should.Matchers {
  test("Test Cases for #1154") {
    dayOfYear("2019-01-09") should be(9)
    dayOfYear("2019-02-10") should be(41)
    dayOfYear("2003-03-01") should be(60)
    dayOfYear("2004-03-01") should be(61)
    dayOfYear("2004-09-01") should be(245)
  }
}
