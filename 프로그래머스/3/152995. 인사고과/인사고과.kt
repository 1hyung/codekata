class Solution {
    fun solution(scores: Array<IntArray>): Int {
        val (meX, meY) = scores[0] // 완호의 점수
        val sortedScores = scores.sortedWith(compareBy({ -it[0] }, { it[1] })) // 근무 태도 내림차순, 동료 평가 오름차순
        val validScores = mutableListOf<Int>() // 인센티브를 받을 수 있는 사원들의 점수 합
        var maxPeerScore = 0 // 현재까지의 최고 동료 평가 점수
        var isValid = false // 완호가 인센티브 대상인지 확인

        for ((x, y) in sortedScores) {
            if (y >= maxPeerScore) { // 두 점수 모두 낮지 않은 경우
                maxPeerScore = y
                validScores.add(x + y) // 점수 합 저장
                if (x == meX && y == meY) isValid = true // 완호의 점수 확인
            }
        }

        if (!isValid) return -1 // 완호가 제외된 경우

        // 점수 합 기준으로 석차 계산
        val target = meX + meY
        var rank = 1
        validScores.sortedDescending().forEach { sum ->
            if (sum == target) return rank // 완호의 석차 반환
            rank++
        }

        return -1 // 이론상 도달할 수 없는 코드
    }
}