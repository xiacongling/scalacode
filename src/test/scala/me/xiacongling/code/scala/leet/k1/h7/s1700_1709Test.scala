package me.xiacongling.code.scala.leet.k1.h7

import me.xiacongling.code.scala.leet.k1.h7.s1700_1709.eatenApples
import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class s1700_1709Test extends AnyFunSuite with should.Matchers {
  test("Test Cases for #1705") {
    eatenApples(Array(0), Array(1)) should be(0)
    eatenApples(Array(1, 2, 3, 5, 2), Array(3, 2, 1, 4, 2)) should be(7)
    eatenApples(Array(3, 0, 0, 0, 0, 2), Array(3, 0, 0, 0, 0, 2)) should be(5)
  }
}
