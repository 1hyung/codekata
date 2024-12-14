class Solution {
    fun solution(n: Int, results: Array<IntArray>): Int {
        // 1. 승패 정보를 저장할 그래프 초기화
        val graph = Array(n + 1) { BooleanArray(n + 1) }

        // 2. 경기 결과를 그래프에 기록
        for (result in results) {
            val winner = result[0] // 이긴 선수
            val loser = result[1]  // 진 선수
            graph[winner][loser] = true
        }

        // 3. 플로이드-워셜 알고리즘으로 모든 선수 간 승패 관계 탐색
        for (k in 1..n) { // 경유하는 선수
            for (i in 1..n) { // 출발 선수
                for (j in 1..n) { // 도착 선수
                    // i -> k -> j가 가능하면 i -> j 관계를 확립
                    if (graph[i][k] && graph[k][j]) {
                        graph[i][j] = true
                    }
                }
            }
        }

        // 4. 정확한 순위를 알 수 있는 선수 카운트
        var answer = 0
        for (i in 1..n) {
            var knownResults = 0
            for (j in 1..n) {
                // i와 j 사이의 승패 관계가 존재하면 knownResults 증가
                if (graph[i][j] || graph[j][i]) {
                    knownResults++
                }
            }
            // 모든 선수와의 관계가 확실하면 순위를 알 수 있음
            if (knownResults == n - 1) {
                answer++
            }
        }

        return answer
    }
}