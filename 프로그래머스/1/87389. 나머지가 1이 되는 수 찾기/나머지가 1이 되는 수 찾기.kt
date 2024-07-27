class Solution {
    fun solution(n: Int): Int {
        for (i in 2 until n) { // 2부터 n-1까지 반복
            if (n % i == 1) {
                return i // 조건을 만족하는 가장 작은 i를 반환
            }
        }
        return n - 1 // 모든 조건을 만족하지 않으면 n-1 반환 (논리적으로 여기까지 도달하지 않음)
    }
}