package me.xiacongling.code.scala.leet.k0.h2

import me.xiacongling.code.scala.leet.k0.h2.s0210_0219.containsNearbyDuplicate
import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class s0210_0219Test extends AnyFunSuite with should.Matchers {
  test("Test Cases for #219") {
    containsNearbyDuplicate(Array(1, 1), 3) shouldBe true
    containsNearbyDuplicate(Array(1, 2, 3, 1), 3) shouldBe true
    containsNearbyDuplicate(Array(1, 0, 1, 1), 1) shouldBe true
    containsNearbyDuplicate(Array(1, 2, 3, 1, 2, 3), 2) shouldBe false
  }
}
