import kotlin.math.*

class Solution {
    private var minMoves = Int.MAX_VALUE
    private var nameLength = 0
    private lateinit var visited: BooleanArray
    private var toChange = 0

    fun solution(name: String): Int {
        nameLength = name.length
        visited = BooleanArray(nameLength) { false }
        var totalCost = 0

        // 알파벳 변경 비용 계산
        for (i in name.indices) {
            val charCost = min(name[i] - 'A', 'Z' - name[i] + 1)
            totalCost += charCost

            // 방문하지 않아야 하는 곳(A)을 미리 처리
            if (name[i] == 'A') visited[i] = true
            else toChange++ // 변경해야 할 문자의 수
        }

        // 좌우 이동 최소화 탐색
        dfs(0, 0, 0)
        return totalCost + minMoves
    }

    private fun dfs(position: Int, moves: Int, changed: Int) {
        // 모든 문자를 변경 완료한 경우
        if (changed == toChange) {
            minMoves = min(minMoves, moves)
            return
        }

        // 오른쪽 탐색
        var right = position
        var rightMoves = 0
        while (visited[right]) {
            right = (right + 1) % nameLength
            rightMoves++
        }

        // 왼쪽 탐색
        var left = position
        var leftMoves = 0
        while (visited[left]) {
            left = (left - 1 + nameLength) % nameLength
            leftMoves++
        }

        // 오른쪽으로 이동
        visited[right] = true
        dfs(right, moves + rightMoves, changed + 1)
        visited[right] = false

        // 왼쪽으로 이동
        visited[left] = true
        dfs(left, moves + leftMoves, changed + 1)
        visited[left] = false
    }
}