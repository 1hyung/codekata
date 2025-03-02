class Solution {
    fun solution(n: Int): Int {
        for (x in 2 until n) { // 2부터 n-1까지 반복
            if (n % x == 1) return x // 나머지가 1이면 즉시 반환
        }
        return n - 1 // 보통 실행되지 않지만, 안전장치로 포함
    }
}