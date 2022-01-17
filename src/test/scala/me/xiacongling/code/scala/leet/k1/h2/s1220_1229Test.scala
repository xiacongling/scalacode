package me.xiacongling.code.scala.leet.k1.h2

import me.xiacongling.code.scala.leet.k1.h2.s1220_1229.countVowelPermutation
import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class s1220_1229Test extends AnyFunSuite with should.Matchers {

  test("Test Cases for #1220") {
    countVowelPermutation(1) shouldBe 5
    countVowelPermutation(2) shouldBe 10
    countVowelPermutation(5) shouldBe 68
  }
}
