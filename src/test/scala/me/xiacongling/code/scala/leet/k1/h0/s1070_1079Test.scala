package me.xiacongling.code.scala.leet.k1.h0

import me.xiacongling.code.scala.leet.k1.h0.s1070_1079.findOcurrences
import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class s1070_1079Test extends AnyFunSuite with should.Matchers {
  test("Test Cases for #1078") {
    findOcurrences("alice is a good girl she is a good student", "a", "good") should
      be(Array("girl", "student"))
    findOcurrences("we will we will rock you", "we", "will") should
      be(Array("we", "rock"))
  }
}
