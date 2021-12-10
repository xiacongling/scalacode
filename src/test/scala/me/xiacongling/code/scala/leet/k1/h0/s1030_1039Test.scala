package me.xiacongling.code.scala.leet.k1.h0

import me.xiacongling.code.scala.leet.k1.h0.s1030_1039.colorBorder
import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class s1030_1039Test extends AnyFunSuite with should.Matchers {
  test("Test Cases for #1034") {
    colorBorder(
      Array(
        Array(1, 1),
        Array(1, 2)
      ), 0, 0, 3
    ) should be(
      Array(
        Array(3, 3),
        Array(3, 2)
      )
    )
    colorBorder(
      Array(
        Array(1, 2, 2),
        Array(2, 3, 2)
      ), 0, 1, 3
    ) should be(
      Array(
        Array(1, 3, 3),
        Array(2, 3, 3)
      )
    )

    colorBorder(
      Array(
        Array(1, 1, 1),
        Array(1, 1, 1),
        Array(1, 1, 1)
      ), 1, 1, 2
    ) should be(
      Array(
        Array(2, 2, 2),
        Array(2, 1, 2),
        Array(2, 2, 2)
      )
    )

    colorBorder(
      Array(
        Array(1, 2, 1, 2, 1, 2),
        Array(2, 2, 2, 2, 1, 2),
        Array(1, 2, 2, 2, 1, 2)
      ), 1, 3, 1
    ) should be(
      Array(
        Array(1, 1, 1, 1, 1, 2),
        Array(1, 2, 1, 1, 1, 2),
        Array(1, 1, 1, 1, 1, 2)
      )
    )
  }
}
