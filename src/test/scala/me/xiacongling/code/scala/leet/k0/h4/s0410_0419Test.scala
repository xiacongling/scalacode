package me.xiacongling.code.scala.leet.k0.h4

import me.xiacongling.code.scala.leet.k0.h4.s0410_0419.countBattleships
import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class s0410_0419Test extends AnyFunSuite with should.Matchers {

  test("Test Cases for #419") {
    countBattleships(Array("X..X".toCharArray, "...X".toCharArray, "...X".toCharArray)) should be(2)
    countBattleships(Array(".".toCharArray)) should be(0)
  }

}
