class Solution {
    fun solution(n: Int, computers: Array<IntArray>): Int {
        val visited = BooleanArray(n) { false }
        var networkCount = 0

        // DFS 함수 정의
        fun dfs(node: Int) {
            visited[node] = true
            for (next in 0 until n) {
                if (computers[node][next] == 1 && !visited[next]) {
                    dfs(next)
                }
            }
        }

        // 모든 노드를 탐색하며 네트워크 개수를 센다
        for (i in 0 until n) {
            if (!visited[i]) {
                dfs(i) // 새로운 네트워크 발견
                networkCount++
            }
        }

        return networkCount
    }
}