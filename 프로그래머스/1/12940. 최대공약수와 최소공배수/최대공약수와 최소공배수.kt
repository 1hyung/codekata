class Solution {
    fun solution(n: Int, m: Int): IntArray {
        // 최대공약수 구하기
        val gcd = gcd(n, m) // 재귀 함수로 최대공약수 계산
        // 최소공배수 구하기
        val lcm = n * m / gcd // 최소공배수는 두 수의 곱을 최대공약수로 나눈 값
        // 결과를 배열로 반환
        return intArrayOf(gcd, lcm)
    }

    // 유클리드 호제법을 사용한 최대공약수 계산 함수
    private fun gcd(a: Int, b: Int): Int {
        return if (b == 0) a else gcd(b, a % b) // b가 0일 때 a가 최대공약수
    }
}