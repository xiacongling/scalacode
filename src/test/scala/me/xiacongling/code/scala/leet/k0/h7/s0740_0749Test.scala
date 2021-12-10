package me.xiacongling.code.scala.leet.k0.h7

import me.xiacongling.code.scala.leet.k0.h7.s0740_0749.shortestCompletingWord
import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class s0740_0749Test extends AnyFunSuite with should.Matchers {
  test("Test Cases for #748") {
    shortestCompletingWord(
      "1s3 PSt",
      Array("step", "steps", "stripe", "stepple")
    ) should be("steps")
    shortestCompletingWord(
      "1s3 456",
      Array("looks", "pest", "stew", "show")
    ) should be("pest")
    shortestCompletingWord(
      "Ah71752",
      Array("suggest", "letter", "of", "husband", "easy", "education", "drug", "prevent", "writer", "old")
    ) should be("husband")
    shortestCompletingWord(
      "OgEu755",
      Array("enough", "these", "play", "wide", "wonder", "box", "arrive", "money", "tax", "thus")
    ) should be("enough")
    shortestCompletingWord(
      "iMSlpe4",
      Array("claim", "consumer", "student", "camera", "public", "never", "wonder", "simple", "thought", "use")
    ) should be("simple")
  }
}
