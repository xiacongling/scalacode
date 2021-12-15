package me.xiacongling.code.scala.leet.k0.h8

import me.xiacongling.code.scala.leet.k0.h8.s0850_0859.loudAndRich
import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class s0850_0859Test extends AnyFunSuite with should.Matchers {
  test("Test Cases for #851") {
    loudAndRich(
      Array(
        Array(1, 0), Array(2, 1), Array(3, 1), Array(3, 7),
        Array(4, 3), Array(5, 3), Array(6, 3)
      ),
      Array(3, 2, 5, 4, 6, 1, 7, 0)
    ) should be(Array(5, 5, 2, 5, 4, 5, 6, 7))

    loudAndRich(
      Array(),
      Array(0)
    ) should be(Array(0))
  }

}
