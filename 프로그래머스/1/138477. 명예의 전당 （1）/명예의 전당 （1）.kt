class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        val honor = mutableListOf<Int>() // 명예의 전당 점수 목록
        val answer = mutableListOf<Int>() // 발표 점수 기록

        for (s in score) {
            honor.add(s) // 새로운 점수 추가
            honor.sortDescending() // 점수 내림차순 정렬
            if (honor.size > k) honor.removeLast() // k개 초과 시 가장 낮은 점수 제거
            answer.add(honor.last()) // 최하위 점수 저장
        }

        return answer.toIntArray()
    }
}