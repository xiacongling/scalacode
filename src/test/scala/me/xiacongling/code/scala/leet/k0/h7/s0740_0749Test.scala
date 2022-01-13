package me.xiacongling.code.scala.leet.k0.h7

import me.xiacongling.code.scala.leet.k0.h7.s0740_0749.{dominantIndex, shortestCompletingWord}
import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class s0740_0749Test extends AnyFunSuite with should.Matchers {
  test("Test Cases for #747") {
    dominantIndex(Array(3, 6, 1, 0)) shouldBe 1
    dominantIndex(Array(1, 2, 3, 4)) shouldBe -1
    dominantIndex(Array(1)) shouldBe 0
  }

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
