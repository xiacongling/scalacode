package me.xiacongling.code.scala.leet.k1.h8

import me.xiacongling.code.scala.leet.k1.h8.s1810_1819.truncateSentence
import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class s1810_1819Test extends AnyFunSuite with should.Matchers {
  test("Test Cases for #1816") {
    truncateSentence("Hello how are you Contestant", 4) should be("Hello how are you")
    truncateSentence("What is the solution to this problem", 4) should be("What is the solution")
    truncateSentence("chopper is not a tanuki", 5) should be("chopper is not a tanuki")
  }
}
