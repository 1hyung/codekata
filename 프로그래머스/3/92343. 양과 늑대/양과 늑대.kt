class Solution {
    private lateinit var graph: Array<MutableList<Int>> // 트리를 그래프 형태로 표현
    private var maxSheep = 0 // 최대 양의 수

    fun solution(info: IntArray, edges: Array<IntArray>): Int {
        graph = Array(info.size) { mutableListOf() }

        // 그래프 구성
        for ((parent, child) in edges) {
            graph[parent].add(child)
        }

        // DFS 탐색 시작 (루트 노드 0번부터 시작)
        dfs(0, 0, 0, mutableListOf(0), info)
        return maxSheep
    }

    private fun dfs(node: Int, sheep: Int, wolves: Int, visitable: MutableList<Int>, info: IntArray) {
        var newSheep = sheep
        var newWolves = wolves

        // 현재 노드 방문: 양과 늑대 수 갱신
        if (info[node] == 0) newSheep++ // 양이면 양의 수 증가
        else newWolves++ // 늑대면 늑대의 수 증가

        // 양의 수가 늑대의 수보다 많아야 함
        if (newSheep <= newWolves) return

        // 최대 양의 수 갱신
        maxSheep = maxOf(maxSheep, newSheep)

        // 방문 가능한 노드 업데이트
        val newVisitable = visitable.toMutableList()
        newVisitable.remove(node) // 현재 노드 제외

        // 현재 노드의 자식 노드 추가
        for (child in graph[node]) {
            newVisitable.add(child)
        }

        // 다음 방문 가능한 노드들로 DFS 탐색
        for (next in newVisitable) {
            dfs(next, newSheep, newWolves, newVisitable, info)
        }
    }
}