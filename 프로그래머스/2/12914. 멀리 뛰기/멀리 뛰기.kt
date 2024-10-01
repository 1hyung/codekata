class Solution {
    fun solution(n: Int): Int {
        // 기본적으로 배열로 DP 테이블을 선언합니다.
        val dp = IntArray(n + 1)

        // 기저 조건 설정
        dp[1] = 1
        if (n > 1) {
            dp[2] = 2
        }

        // 점화식을 통해 DP 배열을 채웁니다.
        for (i in 3..n) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567
        }

        // 마지막 dp[n]의 값을 반환합니다.
        return dp[n]
    }
}
