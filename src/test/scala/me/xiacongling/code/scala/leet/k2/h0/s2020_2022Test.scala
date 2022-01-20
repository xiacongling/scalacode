package me.xiacongling.code.scala.leet.k2.h0

import me.xiacongling.code.scala.leet.k2.h0.s2020_2022.{construct2DArray, stoneGameIX}
import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class s2020_2022Test extends AnyFunSuite with should.Matchers {
  test("Test Cases for #2022") {
    construct2DArray(Array(1, 2, 3, 4), 2, 2) should be(
      Array(Array(1, 2), Array(3, 4))
    )
    construct2DArray(Array(1, 2, 3), 1, 3) should be(
      Array(Array(1, 2, 3))
    )
    construct2DArray(Array(1, 2), 1, 1) should be(Array())
    construct2DArray(Array(3), 1, 2) should be(Array())
  }

  test("Test Cases for #2029") {
    stoneGameIX(Array(2, 1)) shouldBe true
    stoneGameIX(Array(2)) shouldBe false
    stoneGameIX(Array(5, 1, 2, 4, 3)) shouldBe false
  }
}
