// 모의고사
class Solution {
    fun solution(answers: IntArray): IntArray {
        // 수포자들의 찍기 패턴 정의
        val pattern1 = intArrayOf(1, 2, 3, 4, 5)
        val pattern2 = intArrayOf(2, 1, 2, 3, 2, 4, 2, 5)
        val pattern3 = intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)

        // 수포자들의 맞힌 문제 개수를 저장할 배열
        val scores = intArrayOf(0, 0, 0)

        // 정답과 패턴을 비교하여 점수 계산
        for (i in answers.indices) {
            if (answers[i] == pattern1[i % pattern1.size]) scores[0]++
            if (answers[i] == pattern2[i % pattern2.size]) scores[1]++
            if (answers[i] == pattern3[i % pattern3.size]) scores[2]++
        }

        // 최고 점수를 찾음
        val maxScore = scores.maxOrNull()

        // 최고 점수를 받은 수포자(1, 2, 3)를 찾아서 반환
        return scores.indices
            .filter { scores[it] == maxScore }
            .map { it + 1 }
            .toIntArray()
    }
}
