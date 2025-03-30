class Solution {
    fun solution(n: Int, m: Int): IntArray {
        fun gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b) // 최대공약수 재귀 함수
        val gcdValue = gcd(n, m) // 최대공약수
        val lcmValue = n * m / gcdValue // 최소공배수
        return intArrayOf(gcdValue, lcmValue) // 결과 배열로 반환
    }
}