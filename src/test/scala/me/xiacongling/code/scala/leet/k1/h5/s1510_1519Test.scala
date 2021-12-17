package me.xiacongling.code.scala.leet.k1.h5

import me.xiacongling.code.scala.leet.k1.h5.s1510_1519.numWaterBottles
import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class s1510_1519Test extends AnyFunSuite with should.Matchers {
  test("Test Cases for #1518") {
    numWaterBottles(9, 3) should be(13)
    numWaterBottles(15, 4) should be(19)
    numWaterBottles(5, 5) should be(6)
    numWaterBottles(2, 3) should be(2)
  }
}
