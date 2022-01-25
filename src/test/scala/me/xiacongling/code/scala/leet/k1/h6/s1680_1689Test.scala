package me.xiacongling.code.scala.leet.k1.h6

import me.xiacongling.code.scala.leet.k1.h6.s1680_1689.numberOfMatches
import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class s1680_1689Test extends AnyFunSuite with should.Matchers {

  test("Test Cases for #1688") {
    numberOfMatches(1) shouldBe 0
    numberOfMatches(7) shouldBe 6
    numberOfMatches(14) shouldBe 13
  }
}
