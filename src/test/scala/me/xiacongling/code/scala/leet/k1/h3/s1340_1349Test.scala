package me.xiacongling.code.scala.leet.k1.h3

import me.xiacongling.code.scala.leet.k1.h3.s1340_1349.minJumps
import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class s1340_1349Test extends AnyFunSuite with should.Matchers {
  test("Test Cases for #1345") {
    minJumps(Array(100, -23, -23, 404, 100, 23, 23, 23, 3, 404)) shouldBe 3
    minJumps(Array(7)) shouldBe 0
    minJumps(Array(7, 6, 9, 6, 9, 6, 9, 7)) shouldBe 1
    minJumps(Array(6, 1, 9)) shouldBe 2
    minJumps(Array(11, 22, 7, 7, 7, 7, 7, 7, 7, 22, 13)) shouldBe 3
  }
}
