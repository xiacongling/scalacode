package me.xiacongling.code.scala.leet.k0.h9

import me.xiacongling.code.scala.leet.k0.h9.s0910_0919.TopVotedCandidate
import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class s0910_0919Test extends AnyFunSuite with should.Matchers {
  test("Test Cases for #911") {
    val c: TopVotedCandidate = new TopVotedCandidate(
      Array(0, 1, 1, 0, 0, 1, 0),
      Array(0, 5, 10, 15, 20, 25, 30)
    )
    c.q(3) should be(0)
    c.q(12) should be(1)
    c.q(25) should be(1)
    c.q(15) should be(0)
    c.q(24) should be(0)
    c.q(8) should be(1)
  }
}
