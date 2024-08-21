class Solution {
    fun solution(n: Int, m: Int): IntArray {
        val gcd = gcd(n, m)  // 최대공약수 계산
        val lcm = n * m / gcd  // 최소공배수 계산
        return intArrayOf(gcd, lcm)
    }

    // 유클리드 호제법을 사용한 최대공약수 계산 함수
    private fun gcd(a: Int, b: Int): Int {
        return if (b == 0) a else gcd(b, a % b)
    }
}
