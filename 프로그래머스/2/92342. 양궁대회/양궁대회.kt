class Solution {
    private var maxDiff = 0
    private lateinit var bestResult: IntArray

    fun solution(n: Int, info: IntArray): IntArray {
        bestResult = IntArray(11) { 0 }
        dfs(n, 0, IntArray(11), info)
        return if (maxDiff > 0) bestResult else intArrayOf(-1)
    }

    private fun dfs(remaining: Int, idx: Int, ryan: IntArray, apeach: IntArray) {
        if (remaining == 0 || idx == 11) {
            ryan[10] += remaining // 남은 화살 모두 0점에 배치
            val diff = calculateScoreDiff(ryan, apeach)
            if (diff > maxDiff || (diff == maxDiff && isBetter(ryan, bestResult))) {
                maxDiff = diff
                bestResult = ryan.clone()
            }
            ryan[10] -= remaining // 원상복구
            return
        }

        // 라이언이 현재 점수에 화살을 쏘는 경우
        if (remaining > apeach[idx]) {
            ryan[idx] = apeach[idx] + 1
            dfs(remaining - ryan[idx], idx + 1, ryan, apeach)
            ryan[idx] = 0 // 원상복구
        }

        // 라이언이 현재 점수에 화살을 쏘지 않는 경우
        dfs(remaining, idx + 1, ryan, apeach)
    }

    private fun calculateScoreDiff(ryan: IntArray, apeach: IntArray): Int {
        var ryanScore = 0
        var apeachScore = 0

        for (i in 0..10) {
            if (ryan[i] > apeach[i]) {
                ryanScore += 10 - i
            } else if (apeach[i] > 0) {
                apeachScore += 10 - i
            }
        }

        return ryanScore - apeachScore
    }

    private fun isBetter(candidate: IntArray, currentBest: IntArray): Boolean {
        for (i in 10 downTo 0) {
            if (candidate[i] > currentBest[i]) return true
            if (candidate[i] < currentBest[i]) return false
        }
        return false
    }
}