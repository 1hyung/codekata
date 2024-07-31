class Solution {
    fun solution(n: Long): Long {
        // n의 제곱근을 계산합니다.
        val sqrt = kotlin.math.sqrt(n.toDouble()).toLong()
        
        // 제곱근의 제곱이 n과 같은지 확인합니다.
        return if (sqrt * sqrt == n) {
            (sqrt + 1) * (sqrt + 1)
        } else {
            -1
        }
    }
}
