import java.util.LinkedList
import java.util.Queue

class Solution {
    fun solution(n: Int, vertex: Array<IntArray>): Int {
        // 인접 리스트 생성
        val graph = Array(n + 1) { mutableListOf<Int>() }
        for (edge in vertex) {
            graph[edge[0]].add(edge[1])
            graph[edge[1]].add(edge[0])
        }

        // 거리 배열 초기화
        val distances = IntArray(n + 1) { -1 } // -1은 방문하지 않음을 의미
        val queue: Queue<Int> = LinkedList()

        // BFS 시작
        distances[1] = 0
        queue.add(1)

        while (queue.isNotEmpty()) {
            val current = queue.poll()

            for (neighbor in graph[current]) {
                if (distances[neighbor] == -1) {
                    distances[neighbor] = distances[current] + 1
                    queue.add(neighbor)
                }
            }
        }

        // 가장 먼 거리 계산
        val maxDistance = distances.maxOrNull()!!
        return distances.count { it == maxDistance }
    }
}