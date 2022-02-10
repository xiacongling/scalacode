package me.xiacongling.code.scala.leet.k2.h0

import me.xiacongling.code.scala.leet.k2.h0.s2000_2009.countKDifference
import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class s2000_2009Test extends AnyFunSuite with should.Matchers {
  test("Test Cases for #2006") {
    countKDifference(Array(1, 2, 2, 1), 1) shouldBe 4
    countKDifference(Array(1, 3), 3) shouldBe 0
    countKDifference(Array(3, 2, 1, 5, 4), 2) shouldBe 3
    countKDifference(Array(7, 7, 8, 3, 1, 2, 7, 2, 9, 5), 6) shouldBe 6
  }
}
