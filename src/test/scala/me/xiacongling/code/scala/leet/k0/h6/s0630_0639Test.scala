package me.xiacongling.code.scala.leet.k0.h6

import me.xiacongling.code.scala.leet.k0.h6.s0630_0639.scheduleCourse
import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class s0630_0639Test extends AnyFunSuite with should.Matchers {
  test("Test Cases for #630") {
    scheduleCourse(Array(
      Array(100, 200),
      Array(200, 1300),
      Array(1000, 1250),
      Array(2000, 3200)
    )) should be(3)
    scheduleCourse(Array(
      Array(1, 2)
    )) should be(1)
    scheduleCourse(Array(
      Array(3, 2), Array(4, 3)
    )) should be(0)
  }
}
