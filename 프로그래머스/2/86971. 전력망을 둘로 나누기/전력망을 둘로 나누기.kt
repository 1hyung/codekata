// 전력망을 둘로 나누기
class Solution {
    fun solution(n: Int, wires: Array<IntArray>): Int {
        // 그래프 인접 리스트 생성
        val graph = Array(n + 1) { mutableListOf<Int>() }
        for (wire in wires) {
            val (v1, v2) = wire
            graph[v1].add(v2)
            graph[v2].add(v1)
        }

        var minDiff = Int.MAX_VALUE // 최소 차이를 저장할 변수

        // 전선을 하나씩 끊어보며 최소 차이 계산
        for (wire in wires) {
            val (v1, v2) = wire

            // 전선 끊기 (간선 제거)
            graph[v1].remove(v2)
            graph[v2].remove(v1)

            // v1을 기준으로 한쪽 네트워크 송전탑 개수 계산
            val count1 = bfs(v1, graph, n)

            // 다른 쪽 네트워크 송전탑 개수
            val count2 = n - count1

            // 송전탑 개수 차이 계산 및 최소 차이 갱신
            minDiff = minOf(minDiff, kotlin.math.abs(count1 - count2))

            // 전선 복구 (간선 추가)
            graph[v1].add(v2)
            graph[v2].add(v1)
        }

        return minDiff
    }

    // BFS로 네트워크에 연결된 송전탑 개수를 세는 함수
    private fun bfs(start: Int, graph: Array<MutableList<Int>>, n: Int): Int {
        val visited = BooleanArray(n + 1) { false }
        val queue = ArrayDeque<Int>()
        queue.add(start)
        visited[start] = true
        var count = 1 // 시작 송전탑 포함

        while (queue.isNotEmpty()) {
            val node = queue.removeFirst()
            for (neighbor in graph[node]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true
                    queue.add(neighbor)
                    count++
                }
            }
        }
        return count
    }
}