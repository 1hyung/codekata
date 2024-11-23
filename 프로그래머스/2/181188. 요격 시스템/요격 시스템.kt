class Solution {
    fun solution(targets: Array<IntArray>): Int {
        // 종료 지점(e)을 기준으로 오름차순 정렬
        targets.sortBy { it[1] }

        var missiles = 0
        var lastIntercepted = -1.0 // 마지막 요격 미사일이 배치된 위치

        for (target in targets) {
            val (start, end) = target.map { it.toDouble() }

            // 현재 요격 미사일로 커버할 수 없는 경우 새로 배치
            if (lastIntercepted < start) {
                missiles++
                lastIntercepted = end - 0.5 // 개구간을 커버하기 위해 end 직전에 배치
            }
        }

        return missiles
    }
}