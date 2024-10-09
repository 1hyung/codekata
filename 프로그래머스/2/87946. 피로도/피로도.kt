import kotlin.math.max

class Solution {
    // 최대 탐험 가능한 던전 수를 계산하는 함수
    fun solution(k: Int, dungeons: Array<IntArray>): Int {
        return permute(dungeons, k, dungeons.size)
    }

    // 순열을 통해 모든 경우의 수를 탐색하는 함수
    private fun permute(dungeons: Array<IntArray>, initialK: Int, n: Int): Int {
        val used = BooleanArray(n) { false }
        return dfs(dungeons, used, initialK, 0, 0)
    }

    // 깊이 우선 탐색을 통해 가능한 던전의 수를 계산하는 함수
    private fun dfs(dungeons: Array<IntArray>, used: BooleanArray, k: Int, depth: Int, count: Int): Int {
        var maxCount = count
        for (i in dungeons.indices) {
            val (required, consumed) = dungeons[i]
            if (!used[i] && k >= required) { // 아직 방문하지 않았고, 피로도가 충분한 경우
                used[i] = true
                maxCount = max(maxCount, dfs(dungeons, used, k - consumed, depth + 1, count + 1))
                used[i] = false // 탐색이 끝난 후 다시 되돌리기
            }
        }
        return maxCount
    }
}
