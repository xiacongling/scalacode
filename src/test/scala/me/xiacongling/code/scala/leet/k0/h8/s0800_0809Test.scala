package me.xiacongling.code.scala.leet.k0.h8

import me.xiacongling.code.scala.leet.k0.h8.s0800_0809.maxIncreaseKeepingSkyline
import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class s0800_0809Test extends AnyFunSuite with should.Matchers {
  test("Test Cases for #807") {
    maxIncreaseKeepingSkyline(
      Array(
        Array(3, 0, 8, 4),
        Array(2, 4, 5, 7),
        Array(9, 2, 6, 3),
        Array(0, 3, 1, 0)
      )
    ) should be(35)
  }
}
