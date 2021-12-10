package me.xiacongling.code.scala.leet.k0.h3

import me.xiacongling.code.scala.leet.k0.h3.s0370_0379.superPow
import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class s0370_0379Test extends AnyFunSuite with should.Matchers {
  test("Test Cases for #372") {
    superPow(2, Array(3)) should be(8)
    superPow(2, Array(1, 0)) should be(1024)
    superPow(1, Array(4, 3, 3, 8, 5, 2)) should be(1)
    superPow(2147483647, Array(2, 0, 0)) should be(1198)
  }
}
