package me.xiacongling.code.scala.leet.k0.h3

import me.xiacongling.code.scala.leet.k0.h3.s0380_0389.canConstruct
import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class s0380_0389Test extends AnyFunSuite with should.Matchers {
  test("Test Cases for #383") {
    canConstruct("a", "b") should be(false)
    canConstruct("aa", "ab") should be(false)
    canConstruct("aa", "aab") should be(true)
  }
}
