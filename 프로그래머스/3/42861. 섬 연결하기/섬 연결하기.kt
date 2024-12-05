class Solution {
    fun solution(n: Int, costs: Array<IntArray>): Int {
        // 비용 기준으로 간선 정렬
        costs.sortBy { it[2] }

        // Union-Find를 위한 부모 배열 초기화
        val parent = IntArray(n) { it }

        // Union-Find에서 부모 찾기
        fun find(node: Int): Int {
            if (parent[node] == node) return node
            parent[node] = find(parent[node]) // 경로 압축
            return parent[node]
        }

        // Union-Find에서 두 집합을 합치기
        fun union(node1: Int, node2: Int) {
            val root1 = find(node1)
            val root2 = find(node2)
            if (root1 != root2) parent[root1] = root2
        }

        var totalCost = 0
        var edgeCount = 0

        // 간선을 하나씩 선택
        for (edge in costs) {
            val (node1, node2, cost) = edge
            if (find(node1) != find(node2)) { // 사이클이 발생하지 않으면
                union(node1, node2)
                totalCost += cost
                edgeCount++
                if (edgeCount == n - 1) break // 모든 노드가 연결되면 종료
            }
        }

        return totalCost
    }
}