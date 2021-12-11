package me.xiacongling.code.scala.leet.k0.h7

import me.xiacongling.code.scala.leet.k0.h7.s0700_0709.toLowerCase
import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class s0700_0709Test extends AnyFunSuite with should.Matchers {
  test("Test Cases for #709") {
    toLowerCase("Hello") should be("hello")
    toLowerCase("here") should be("here")
    toLowerCase("LOVELY") should be("lovely")
  }
}
