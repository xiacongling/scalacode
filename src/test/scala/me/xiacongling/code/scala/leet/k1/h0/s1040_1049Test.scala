package me.xiacongling.code.scala.leet.k1.h0

import me.xiacongling.code.scala.leet.k1.h0.s1040_1049.longestDupSubstring
import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class s1040_1049Test extends AnyFunSuite with should.Matchers {
  test("Test Cases for #1044") {
    longestDupSubstring("banana") should be("ana")
    longestDupSubstring("abcd") should be("")
    longestDupSubstring("abcdd") should be("d")
  }
}
