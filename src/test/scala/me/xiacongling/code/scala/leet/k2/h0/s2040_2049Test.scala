package me.xiacongling.code.scala.leet.k2.h0

import me.xiacongling.code.scala.leet.k2.h0.s2040_2049.countValidWords
import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class s2040_2049Test extends AnyFunSuite with should.Matchers {
  test("Test Cases for #2047") {
    countValidWords("-") shouldBe 0
    countValidWords(" o6 t") shouldBe 1
    countValidWords("cat and  dog") shouldBe 3
    countValidWords("!this  1-s b8d!") shouldBe 0
    countValidWords("alice and  bob are playing stone-game10") shouldBe 5
    countValidWords("he bought 2 pencils, 3 erasers, and 1  pencil-sharpener.") shouldBe 6
  }
}
