// 배달
import java.util.*

class Solution {
    fun solution(N: Int, road: Array<IntArray>, K: Int): Int {
        // 1. 그래프 생성
        val graph = Array(N + 1) { mutableListOf<Pair<Int, Int>>() }
        for (r in road) {
            val (a, b, c) = r
            graph[a].add(b to c)
            graph[b].add(a to c)
        }

        // 2. 다익스트라 알고리즘 초기화
        val distances = IntArray(N + 1) { Int.MAX_VALUE }
        distances[1] = 0
        val queue = PriorityQueue<Pair<Int, Int>>(compareBy { it.second }) // (노드, 거리)
        queue.offer(1 to 0)

        // 3. 다익스트라 실행
        while (queue.isNotEmpty()) {
            val (current, currentDist) = queue.poll()

            // 이미 더 짧은 경로로 방문했다면 무시
            if (currentDist > distances[current]) continue

            // 인접 노드 탐색
            for ((next, time) in graph[current]) {
                val newDist = currentDist + time
                if (newDist < distances[next]) {
                    distances[next] = newDist
                    queue.offer(next to newDist)
                }
            }
        }

        // 4. K 이하의 거리인 마을 개수 세기
        return distances.count { it <= K }
    }
}