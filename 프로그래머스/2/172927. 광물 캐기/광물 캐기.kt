class Solution {
    private fun solve(picks: IntArray, minerals: List<String>, fatigue: Int): Int {
        // 남은 곡괭이가 없거나 더 이상 캘 광물이 없으면 현재 누적된 피로도 반환
        if (picks.sum() == 0 || minerals.isEmpty()) return fatigue
        
        // 피로도 비용을 다이아몬드, 철, 돌 곡괭이 순으로 정의
        val fatigueCosts = listOf(
            mapOf("diamond" to 1, "iron" to 1, "stone" to 1),      // 다이아몬드 곡괭이
            mapOf("diamond" to 5, "iron" to 1, "stone" to 1),      // 철 곡괭이
            mapOf("diamond" to 25, "iron" to 5, "stone" to 1)      // 돌 곡괭이
        )

        // 각 곡괭이로 첫 5개의 광물을 캘 경우의 피로도를 계산하고 최소 피로도를 찾음
        return fatigueCosts.mapIndexed { index, fatigues ->
            if (picks[index] > 0) {
                // 사용한 곡괭이 개수 업데이트
                val nextPicks = picks.clone()
                nextPicks[index] -= 1

                // 현재 곡괭이로 캘 수 있는 5개의 광물 피로도 누적
                val currentFatigue = minerals.take(5).sumOf { fatigues.getOrDefault(it, 0) }

                // 재귀 호출로 다음 5개를 캘 때 최적의 피로도 계산
                solve(nextPicks, minerals.drop(5), fatigue + currentFatigue)
            } else Int.MAX_VALUE // 해당 곡괭이를 사용할 수 없는 경우 매우 큰 피로도 반환
        }.minOrNull()!! // 모든 경우 중 최소 피로도 선택
    }

    fun solution(picks: IntArray, minerals: Array<String>): Int {
        return solve(picks, minerals.asList(), 0)
    }
}