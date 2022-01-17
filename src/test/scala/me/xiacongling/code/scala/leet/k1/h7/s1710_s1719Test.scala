package me.xiacongling.code.scala.leet.k1.h7

import me.xiacongling.code.scala.leet.k1.h7.s1710_s1719.totalMoney
import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class s1710_s1719Test extends AnyFunSuite with should.Matchers {
  test("Test Cases for #1716") {
    totalMoney(4) shouldBe 10
    totalMoney(10) shouldBe 37
    totalMoney(20) shouldBe 96
  }
}
