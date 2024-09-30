class Solution {
    fun solution(arr: IntArray): Int {
        // 최소공배수를 구하기 위한 gcd 함수 정의
        fun gcd(a: Int, b: Int): Int {
            return if (b == 0) a else gcd(b, a % b)
        }

        // 두 수의 최소공배수를 구하는 함수 정의
        fun lcm(a: Int, b: Int): Int {
            return (a * b) / gcd(a, b)
        }

        // 배열의 최소공배수를 구하기 위해 reduce 함수 사용
        return arr.reduce { acc, num -> lcm(acc, num) }
    }
}
