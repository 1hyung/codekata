class Solution {
    fun solution(n: Long): Long {
        val sqrt = Math.sqrt(n.toDouble()).toLong() // n의 제곱근을 구한 후 정수 변환
        return if (sqrt * sqrt == n) (sqrt + 1) * (sqrt + 1) else -1
    }
}