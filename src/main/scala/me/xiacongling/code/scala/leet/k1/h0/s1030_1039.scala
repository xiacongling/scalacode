package me.xiacongling.code.scala.leet.k1.h0

import me.xiacongling.code.scala.leet.{Difficulty, Solution}

object s1030_1039 {
  @Solution(id = 1034, title = "边界着色", difficulty = Difficulty.Medium, description =
    """给你一个大小为 m x n 的整数矩阵 grid ，表示一个网格。另给你三个整数 row、col 和 color。
      |网格中的每个值表示该位置处的网格块的颜色。
      |
      |当两个网格块的颜色相同，而且在四个方向中任意一个方向上相邻时，它们属于同一连通分量。
      |
      |连通分量的边界是指连通分量中的所有与不在分量中的网格块相邻（四个方向上）的所有网格块，或者在网格的边界上
      |（第一行/列或最后一行/列）的所有网格块。
      |
      |请你使用指定颜色 color 为所有包含网格块 grid[row][col] 的连通分量的边界进行着色，并返回最终的网格 grid 。
      |
      |示例 1：
      |输入：grid = [[1,1],[1,2]], row = 0, col = 0, color = 3
      |输出：[[3,3],[3,2]]
      |
      |示例 2：
      |输入：grid = [[1,2,2],[2,3,2]], row = 0, col = 1, color = 3
      |输出：[[1,3,3],[2,3,3]]
      |
      |示例 3：
      |输入：grid = [[1,1,1],[1,1,1],[1,1,1]], row = 1, col = 1, color = 2
      |输出：[[2,2,2],[2,1,2],[2,2,2]]
      |
      |提示：
      |* m == grid.length
      |* n == grid[i].length
      |* 1 <= m, n <= 50
      |* 1 <= grid[i][j], color <= 1000
      |* 0 <= row < m
      |* 0 <= col < n
      |
      |来源：力扣（LeetCode）
      |链接：https://leetcode-cn.com/problems/coloring-a-border
      |著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
      |""".stripMargin)
  def colorBorder(grid: Array[Array[Int]], row: Int, col: Int, color: Int): Array[Array[Int]] = {
    val m: Int = grid.length
    val n: Int = grid(0).length
    val from: Int = grid(row)(col)
    val to: Int = color
    val visited: Array[Array[Boolean]] = Array.ofDim(m, n)

    def connected(pos: (Int, Int)): List[(Int, Int)] = {
      List((pos._1 - 1, pos._2), (pos._1 + 1, pos._2), (pos._1, pos._2 - 1), (pos._1, pos._2 + 1))
        .filter(it => it._1 >= 0 && it._1 < m && it._2 >= 0 && it._2 < n && grid(it._1)(it._2) == from)
    }

    def visit(pos: (Int, Int)): Unit = {
      visited(pos._1)(pos._2) = true
    }

    if (from != to) {
      var layer: Set[(Int, Int)] = Set((row, col))
      var border: List[(Int, Int)] = List()
      while (layer.nonEmpty) {
        layer.foreach(visit)
        val adjMap: Map[(Int, Int), List[(Int, Int)]] = layer.map(it => it -> connected(it)).toMap
        border :++= adjMap.filter(it => it._2.size < 4).keys
        layer = adjMap.values.flatten.toSet.filterNot(it => visited(it._1)(it._2))
      }
      border.foreach(it => grid(it._1)(it._2) = to)
    }
    grid
  }
}
