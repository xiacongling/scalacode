package me.xiacongling.code.scala.leet.k0.h0

import me.xiacongling.code.scala.leet.k0.h0.s0070_0079.simplifyPath
import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class s0070_0079Test extends AnyFunSuite with should.Matchers {
  test("Test Cases for #71") {
    simplifyPath("/home") should be("/home")
    simplifyPath("/../") should be("/")
    simplifyPath("/home//foo/") should be("/home/foo")
    simplifyPath("/a/./b/../../c/") should be("/c")
  }
}
