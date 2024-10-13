class Solution {
    fun solution(word: String): Int {
        val vowels = listOf('A', 'E', 'I', 'O', 'U')  // 모음 리스트
        val weight = intArrayOf(781, 156, 31, 6, 1)    // 각 자리별 가중치

        var result = 0

        for (i in word.indices) {
            // 해당 문자가 위치한 인덱스 값을 찾고, 그 인덱스를 기반으로 가중치 계산
            val idx = vowels.indexOf(word[i])
            result += idx * weight[i] + 1  // 가중치 곱한 후 1을 더함 (현재 단어 포함)
        }

        return result
    }
}
