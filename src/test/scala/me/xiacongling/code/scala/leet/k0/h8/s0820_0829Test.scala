package me.xiacongling.code.scala.leet.k0.h8

import me.xiacongling.code.scala.leet.k0.h8.s0820_0829.numFriendRequests
import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class s0820_0829Test extends AnyFunSuite with should.Matchers {
  test("Test Cases for #825") {
    //    numFriendRequests(Array(16, 16)) should be(2)
    //    numFriendRequests(Array(16, 17, 18)) should be(2)
    //    numFriendRequests(Array(20, 30, 100, 110, 120)) should be(3)
    //    numFriendRequests(Array(101, 98, 80, 20, 1, 97, 3, 77, 114, 109)) should be(21)
    numFriendRequests(Array(45, 45, 41, 23, 99, 19, 90, 44, 24, 10, 24, 20, 78, 104, 91)) should be(26)
  }
}
