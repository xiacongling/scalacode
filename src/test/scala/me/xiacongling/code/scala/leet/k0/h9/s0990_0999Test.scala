package me.xiacongling.code.scala.leet.k0.h9

import me.xiacongling.code.scala.leet.k0.h9.s0990_0999.findJudge
import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class s0990_0999Test extends AnyFunSuite with should.Matchers {
  test("Test Cases for #997") {
    findJudge(1, Array()) should be(1)
    findJudge(2, Array(Array(1, 2))) should be(2)
    findJudge(2, Array(Array(1, 2), Array(2, 1))) should be(-1)
    findJudge(3, Array(Array(1, 3), Array(2, 3))) should be(3)
    findJudge(3, Array(Array(1, 3), Array(2, 3), Array(3, 1))) should be(-1)
    findJudge(3, Array(Array(1, 2), Array(2, 3))) should be(-1)
    findJudge(4, Array(Array(1, 3), Array(1, 4), Array(2, 3), Array(2, 4), Array(4, 3))) should be(3)
  }
}
