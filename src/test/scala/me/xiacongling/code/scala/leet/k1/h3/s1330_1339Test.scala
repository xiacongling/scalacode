package me.xiacongling.code.scala.leet.k1.h3

import me.xiacongling.code.scala.leet.k1.h3.s1330_1339.removePalindromeSub
import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class s1330_1339Test extends AnyFunSuite with should.Matchers {
  test("Test Cases for #1332") {
    removePalindromeSub("a") shouldBe 1
    removePalindromeSub("ababa") shouldBe 1
    removePalindromeSub("abb") shouldBe 2
    removePalindromeSub("baabb") shouldBe 2
  }
}
