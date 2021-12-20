package me.xiacongling.code.scala.leet.k0.h4

import me.xiacongling.code.scala.leet.k0.h4.s0470_0479.findRadius
import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class s0470_0479Test extends AnyFunSuite with should.Matchers {
  test("Test Cases for #475") {
    findRadius(Array(1, 2, 3), Array(2)) should be(1)
    findRadius(Array(1, 2, 3, 4), Array(1, 4)) should be(1)
    findRadius(Array(1, 5), Array(2)) should be(3)
  }
}
