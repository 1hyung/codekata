import java.util.PriorityQueue

class Solution {
    fun solution(n: Int, roads: Array<IntArray>, sources: IntArray, destination: Int): IntArray {
        // 1. 그래프 생성
        val graph = Array(n + 1) { mutableListOf<Int>() }
        for (road in roads) {
            val (a, b) = road
            graph[a].add(b)
            graph[b].add(a)
        }

        // 2. 다익스트라 알고리즘으로 최단 거리 계산
        val distances = IntArray(n + 1) { Int.MAX_VALUE }
        distances[destination] = 0 // 부대 위치는 거리 0
        val pq = PriorityQueue<Pair<Int, Int>>(compareBy { it.second })
        pq.add(destination to 0)

        while (pq.isNotEmpty()) {
            val (current, currentDist) = pq.poll()

            if (currentDist > distances[current]) continue // 더 긴 경로는 무시

            for (neighbor in graph[current]) {
                val newDist = currentDist + 1
                if (newDist < distances[neighbor]) {
                    distances[neighbor] = newDist
                    pq.add(neighbor to newDist)
                }
            }
        }

        // 3. 요청한 sources에 대한 결과 반환
        return sources.map { source ->
            if (distances[source] == Int.MAX_VALUE) -1 else distances[source]
        }.toIntArray()
    }
}