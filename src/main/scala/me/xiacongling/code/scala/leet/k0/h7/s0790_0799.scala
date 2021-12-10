package me.xiacongling.code.scala.leet.k0.h7

import me.xiacongling.code.scala.leet.{Difficulty, Solution}

object s0790_0799 {
  @Solution(id = 794, title = "有效的井字游戏", difficulty = Difficulty.Medium, description =
    """用字符串数组作为井字游戏的游戏板 board。当且仅当在井字游戏过程中，玩家有可能
      |将字符放置成游戏板所显示的状态时，才返回 true。
      |
      |该游戏板是一个 3 x 3 数组，由字符 " "，"X" 和 "O" 组成。字符 " " 代表一个空位。
      |
      |以下是井字游戏的规则：
      |*  玩家轮流将字符放入空位（" "）中。
      |*  第一个玩家总是放字符 “X”，且第二个玩家总是放字符 “O”。
      |*  “X” 和 “O” 只允许放置在空位中，不允许对已放有字符的位置进行填充。
      |*  当有 3 个相同（且非空）的字符填充任何行、列或对角线时，游戏结束。
      |*  当所有位置非空时，也算为游戏结束。
      |*  如果游戏结束，玩家不允许再放置字符。
      |
      |示例 1:
      |输入: board = ["O  ", "   ", "   "]
      |输出: false
      |解释: 第一个玩家总是放置“X”。
      |
      |示例 2:
      |输入: board = ["XOX", " X ", "   "]
      |输出: false
      |解释: 玩家应该是轮流放置的。
      |
      |示例 3:
      |输入: board = ["XXX", "   ", "OOO"]
      |输出: false
      |
      |示例 4:
      |输入: board = ["XOX", "O O", "XOX"]
      |输出: true
      |
      |说明:
      |* 游戏板 board 是长度为 3 的字符串数组，其中每个字符串 board[i] 的长度为 3。
      |* board[i][j] 是集合 {" ", "X", "O"} 中的一个字符。
      |
      |来源：力扣（LeetCode）
      |链接：https://leetcode-cn.com/problems/valid-tic-tac-toe-state
      |著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
      |""".stripMargin)
  def validTicTacToe(board: Array[String]): Boolean = {
    val transposed: Array[String] = Array(
      "" + board(0)(0) + board(1)(0) + board(2)(0),
      "" + board(0)(1) + board(1)(1) + board(2)(1),
      "" + board(0)(2) + board(1)(2) + board(2)(2),
    )
    val cnt: Map[Char, Int] = board.flatten.groupBy(it => it)
      .view
      .mapValues(_.length)
      .toMap

    def wonX(): Boolean = board.contains("XXX") ||
      transposed.contains("XXX") ||
      Array(0, 1, 2).forall(i => board(i)(i) == 'X') ||
      Array(0, 1, 2).forall(i => board(2 - i)(i) == 'X')

    def wonO(): Boolean = board.contains("OOO") ||
      transposed.contains("OOO") ||
      Array(0, 1, 2).forall(i => board(i)(i) == 'O') ||
      Array(0, 1, 2).forall(i => board(2 - i)(i) == 'O')

    val x: Int = cnt.getOrElse('X', 0)
    val o: Int = cnt.getOrElse('O', 0)
    if (o > x || o < x - 1 || (wonO() && wonX())) {
      false
    } else if (!wonO() && !wonX() || wonO() && o == x || wonX() && o == x - 1) {
      true
    } else {
      false
    }
  }
}
