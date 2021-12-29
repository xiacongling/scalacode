package me.xiacongling.code.scala.leet.k1.h9

import me.xiacongling.code.scala.leet.k1.h9.s1990_1999.countQuadruplets
import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class s1990_1999Test extends AnyFunSuite with should.Matchers {
  test("Test Cases for #1995") {
    countQuadruplets(Array(28, 8, 49, 85, 37, 90, 20, 8)) should be(1)
    countQuadruplets(Array(1, 2, 3, 6)) should be(1)
    countQuadruplets(Array(3, 3, 6, 4, 5)) should be(0)
    countQuadruplets(Array(1, 1, 1, 3, 5)) should be(4)
  }
}
