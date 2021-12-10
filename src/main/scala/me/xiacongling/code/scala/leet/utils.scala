package me.xiacongling.code.scala.leet


case class Solution(id: Int, title: String, difficulty: Difficulty, description: String) extends scala.annotation.StaticAnnotation

sealed abstract class Difficulty extends Product with Serializable

object Difficulty {
  final case object Easy extends Difficulty

  final case object Medium extends Difficulty

  final case object Hard extends Difficulty
}