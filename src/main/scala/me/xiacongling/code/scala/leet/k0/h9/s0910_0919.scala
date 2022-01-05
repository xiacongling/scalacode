package me.xiacongling.code.scala.leet.k0.h9

import me.xiacongling.code.scala.leet.{Difficulty, Solution}

import scala.collection.mutable

object s0910_0919 {
  @Solution(id = 911, title = "在线选举", difficulty = Difficulty.Medium, description =
    """给你两个整数数组 persons 和 times 。在选举中，第 i 张票是在时刻为 times[i] 时投给候选人 persons[i] 的。
      |
      |对于发生在时刻 t 的每个查询，需要找出在 t 时刻在选举中领先的候选人的编号。
      |
      |在 t 时刻投出的选票也将被计入我们的查询之中。在平局的情况下，最近获得投票的候选人将会获胜。
      |
      |实现 TopVotedCandidate 类：
      |* TopVotedCandidate(int[] persons, int[] times) 使用 persons 和 times 数组初始化对象。
      |* int q(int t) 根据前面描述的规则，返回在时刻 t 在选举中领先的候选人的编号。
      | 
      |示例：
      |
      |输入：
      |["TopVotedCandidate", "q", "q", "q", "q", "q", "q"]
      |[[[0, 1, 1, 0, 0, 1, 0], [0, 5, 10, 15, 20, 25, 30]], [3], [12], [25], [15], [24], [8]]
      |输出：
      |[null, 0, 1, 1, 0, 0, 1]
      |
      |解释：
      |TopVotedCandidate topVotedCandidate = new TopVotedCandidate([0, 1, 1, 0, 0, 1, 0], [0, 5, 10, 15, 20, 25, 30]);
      |topVotedCandidate.q(3); // 返回 0 ，在时刻 3 ，票数分布为 [0] ，编号为 0 的候选人领先。
      |topVotedCandidate.q(12); // 返回 1 ，在时刻 12 ，票数分布为 [0,1,1] ，编号为 1 的候选人领先。
      |topVotedCandidate.q(25); // 返回 1 ，在时刻 25 ，票数分布为 [0,1,1,0,0,1] ，编号为 1 的候选人领先。（在平局的情况下，1 是最近获得投票的候选人）。
      |topVotedCandidate.q(15); // 返回 0
      |topVotedCandidate.q(24); // 返回 0
      |topVotedCandidate.q(8); // 返回 1
      |
      |提示：
      |* 1 <= persons.length <= 5000
      |* times.length == persons.length
      |* 0 <= persons[i] < persons.length
      |* 0 <= times[i] <= 10^9
      |* times 是一个严格递增的有序数组
      |* times[0] <= t <= 10^9
      |* 每个测试用例最多调用 104 次 q
      |
      |来源：力扣（LeetCode）
      |链接：https://leetcode-cn.com/problems/online-election
      |著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
      |""".stripMargin)
  class TopVotedCandidate(_persons: Array[Int], _times: Array[Int]) {
    val lead: mutable.TreeMap[Int, Int] = mutable.TreeMap()

    val calculateLead: Unit = {
      val cnt: mutable.Map[Int, Int] = mutable.HashMap()
      var m: Int = 0
      for (i <- _persons.indices) {
        val c: Int = cnt.updateWith(_persons(i))(it => Some(it.getOrElse(0) + 1)).get
        if (c >= m) {
          m = c
          lead.put(_times(i), _persons(i))
        }
      }
    }

    def q(t: Int): Int = {
      lead.getOrElse(t, lead.maxBefore(t).getOrElse((0, 0))._2)
    }
  }

  @Solution(id = 913, title = "猫和老鼠", difficulty = Difficulty.Hard, description =
    """两位玩家分别扮演猫和老鼠，在一张 无向 图上进行游戏，两人轮流行动。
      |
      |图的形式是：graph[a] 是一个列表，由满足  ab 是图中的一条边的所有节点 b 组成。
      |
      |老鼠从节点 1 开始，第一个出发；猫从节点 2 开始，第二个出发。在节点 0 处有一个洞。
      |
      |在每个玩家的行动中，他们 必须 沿着图中与所在当前位置连通的一条边移动。例如，如果老鼠在节点 1，
      |那么它必须移动到 graph[1] 中的任一节点。
      |
      |此外，猫无法移动到洞中（节点 0）。
      |
      |然后，游戏在出现以下三种情形之一时结束：
      |
      |* 如果猫和老鼠出现在同一个节点，猫获胜。
      |* 如果老鼠到达洞中，老鼠获胜。
      |* 如果某一位置重复出现（即，玩家的位置和移动顺序都与上一次行动相同），游戏平局。
      |
      |给你一张图 graph ，并假设两位玩家都都以最佳状态参与游戏：
      |
      |* 如果老鼠获胜，则返回 1；
      |* 如果猫获胜，则返回 2；
      |* 如果平局，则返回 0 。
      |  
      |示例 1：
      |输入：graph = [[2,5],[3],[0,4,5],[1,4,5],[2,3],[0,2,3]]
      |输出：0
      |
      |示例 2：
      |输入：graph = [[1,3],[0],[3],[0,2]]
      |输出：1
      |
      |提示：
      |* 3 <= graph.length <= 50
      |* 1 <= graph[i].length < graph.length
      |* 0 <= graph[i][j] < graph.length
      |* graph[i][j] != i
      |* graph[i] 互不相同
      |* 猫和老鼠在游戏中总是移动
      |
      |来源：力扣（LeetCode）
      |链接：https://leetcode-cn.com/problems/cat-and-mouse
      |著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
      |""".stripMargin)
  def catMouseGame(graph: Array[Array[Int]]): Int = {
    // TODO
    0
  }
}
