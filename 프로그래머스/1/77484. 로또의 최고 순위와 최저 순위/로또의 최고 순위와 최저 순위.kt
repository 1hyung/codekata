class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        // 0의 개수와 맞춘 번호의 개수를 계산
        val zeros = lottos.count { it == 0 }
        val correct = lottos.count { it in win_nums }

        // 맞춘 개수에 따른 순위를 계산하는 함수
        fun getRank(matches: Int): Int {
            return when (matches) {
                6 -> 1
                5 -> 2
                4 -> 3
                3 -> 4
                2 -> 5
                else -> 6
            }
        }

        // 최고 순위는 0이 모두 맞는 경우, 최저 순위는 0이 모두 틀린 경우
        val maxRank = getRank(correct + zeros)
        val minRank = getRank(correct)

        return intArrayOf(maxRank, minRank)
    }
}
