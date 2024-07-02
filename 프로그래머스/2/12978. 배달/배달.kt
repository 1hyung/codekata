import java.util.PriorityQueue

class Solution {
    data class Node(val index: Int, val distance: Int) : Comparable<Node> {
        override fun compareTo(other: Node): Int {
            return this.distance.compareTo(other.distance)
        }
    }

    fun solution(N: Int, road: Array<IntArray>, k: Int): Int {
        val town = IntArray(N + 1) { 500001 }.apply { this[1] = 0 }
        val pq = PriorityQueue<Node>().apply { offer(Node(1, 0)) }

        while (pq.isNotEmpty()) {
            val now = pq.poll()
            if (now.distance > town[now.index]) continue

            for (i in road.indices) {
                val nextIndex: Int
                val cost: Int

                if (road[i][0] == now.index) {
                    nextIndex = road[i][1]
                    cost = now.distance + road[i][2]
                }
                else if (road[i][1] == now.index) {
                    nextIndex = road[i][0]
                    cost = now.distance + road[i][2]
                }
                else {
                    continue
                }

                if (cost < town[nextIndex]) {
                    town[nextIndex] = cost
                    pq.offer(Node(nextIndex, cost))
                }
            }
        }

        return town.count { it <= k }
    }
}
