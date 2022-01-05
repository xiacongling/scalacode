package me.xiacongling.code.scala.leet.k1.h1

import me.xiacongling.code.scala.leet.k1.h1.s1180_1189.dayOfTheWeek
import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class s1180_1189Test extends AnyFunSuite with should.Matchers {
  test("Test Cases for #1185") {
    dayOfTheWeek(21, 12, 1980) should be("Sunday")
    dayOfTheWeek(31, 8, 2019) should be("Saturday")
    dayOfTheWeek(18, 7, 1999) should be("Sunday")
    dayOfTheWeek(15, 8, 1993) should be("Sunday")
  }
}
