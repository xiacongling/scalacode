package me.xiacongling.code.scala.leet.k1.h5

import me.xiacongling.code.scala.leet.k1.h5.s1570_1579.modifyString
import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class s1570_1579Test extends AnyFunSuite with should.Matchers {
  test("Test Cases for #1576") {
    modifyString("?") should be("a")
    modifyString("a") should be("a")
    modifyString("?zs") should be("azs")
    modifyString("ubv?w") should be("ubvaw")
    modifyString("j?qg??b") should be("jaqgacb")
    modifyString("??yw?ipkj?") should be("abywaipkja")
  }
}
