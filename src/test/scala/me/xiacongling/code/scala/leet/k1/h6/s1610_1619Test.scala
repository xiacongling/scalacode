package me.xiacongling.code.scala.leet.k1.h6

import me.xiacongling.code.scala.leet.k1.h6.s1610_1619.visiblePoints
import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class s1610_1619Test extends AnyFunSuite with should.Matchers {
  test("Test Cases for #1610") {
    visiblePoints(List(
      List(30, 48), List(26, 26), List(82, 91), List(63, 7), List(3, 65), List(74, 0), List(12, 26),
      List(12, 46), List(57, 1), List(32, 17), List(96, 37), List(21, 54), List(20, 47), List(88, 61),
      List(88, 44), List(69, 18), List(21, 50), List(23, 42), List(48, 43), List(9, 93), List(45, 81),
      List(43, 58), List(14, 82), List(92, 63), List(16, 33), List(49, 34), List(57, 50), List(59, 91),
      List(59, 61), List(13, 80), List(21, 81), List(3, 56), List(30, 85), List(70, 94), List(59, 27),
      List(56, 15), List(4, 50), List(30, 11), List(45, 82), List(87, 49), List(12, 24), List(93, 37),
      List(20, 38), List(53, 76), List(28, 25), List(65, 93), List(31, 86), List(25, 50), List(63, 60),
      List(79, 48), List(73, 58), List(76, 63), List(99, 43), List(17, 45), List(53, 9), List(99, 38),
      List(10, 31), List(14, 22), List(30, 53), List(34, 88), List(37, 59), List(66, 86), List(87, 58),
      List(100, 15), List(48, 0), List(55, 31), List(50, 19), List(96, 32), List(40, 79), List(46, 45),
      List(73, 47), List(74, 28), List(72, 66), List(35, 42), List(6, 89), List(62, 49), List(67, 42),
      List(80, 47), List(82, 31), List(8, 96), List(97, 59), List(36, 65), List(31, 48), List(69, 11),
      List(12, 25), List(68, 56), List(39, 62), List(37, 8), List(58, 36), List(5, 56), List(99, 94),
      List(80, 94), List(64, 70), List(80, 61), List(76, 47), List(78, 67), List(41, 70), List(85, 60),
      List(15, 40), List(40, 50), List(20, 44), List(87, 32), List(55, 90), List(33, 76), List(76, 65),
      List(49, 50), List(51, 10), List(70, 76), List(1, 28)), 180, List(52, 19)
    ) should be(97)
    visiblePoints(List(List(1, 1), List(1, 1)), 1, List(1, 1)) should be(2)
    visiblePoints(List(List(0, 0), List(0, 2)), 90, List(1, 1)) should be(2)
    visiblePoints(List(
      List(34, 26), List(35, 95), List(31, 56), List(84, 75), List(26, 76), List(22, 15), List(26, 78), List(90, 41),
      List(94, 18), List(12, 88), List(42, 82), List(27, 0), List(85, 49), List(69, 71), List(13, 36), List(59, 58),
      List(58, 18), List(21, 62)), 15, List(67, 91)
    ) should be(4)
    visiblePoints(
      List(List(1, 1), List(2, 2), List(3, 3), List(4, 4), List(1, 2), List(2, 1)), 0, List(1, 1)
    ) should be(4)
    visiblePoints(List(List(1, 1), List(2, 2), List(1, 2), List(2, 1)), 0, List(1, 1))
    visiblePoints(List(List(2, 1), List(2, 2), List(3, 3)), 90, List(1, 1)) should be(3)
    visiblePoints(List(List(2, 1), List(2, 2), List(3, 4), List(1, 1)), 90, List(1, 1)) should be(4)
    visiblePoints(List(List(1, 0), List(2, 1)), 13, List(1, 1)) should be(1)
  }
}
