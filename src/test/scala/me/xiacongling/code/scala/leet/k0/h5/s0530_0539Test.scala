package me.xiacongling.code.scala.leet.k0.h5

import me.xiacongling.code.scala.leet.k0.h5.s0530_0539.findMinDifference
import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class s0530_0539Test extends AnyFunSuite with should.Matchers {

  test("Test Cases for #539") {
    findMinDifference(List("23:59", "00:00")) shouldBe 1
    findMinDifference(List("00:00", "23:59", "00:00")) shouldBe 0
  }
}
