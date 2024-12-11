class Solution {
    fun solution(sequence: IntArray): Long {
        val n = sequence.size
        var pulse1 = 1
        var pulse2 = -1
        var maxSum1 = Long.MIN_VALUE
        var maxSum2 = Long.MIN_VALUE
        var currentSum1 = 0L
        var currentSum2 = 0L

        for (i in sequence.indices) {
            // 펄스 1 처리
            currentSum1 = maxOf(sequence[i] * pulse1.toLong(), currentSum1 + sequence[i] * pulse1)
            maxSum1 = maxOf(maxSum1, currentSum1)

            // 펄스 2 처리
            currentSum2 = maxOf(sequence[i] * pulse2.toLong(), currentSum2 + sequence[i] * pulse2)
            maxSum2 = maxOf(maxSum2, currentSum2)

            // 펄스 값 전환
            pulse1 *= -1
            pulse2 *= -1
        }

        return maxOf(maxSum1, maxSum2)
    }
}