class Solution {
    fun solution(n: Int): Int {
        for (x in 2 until n) { // x는 2부터 n-1까지 반복
            if (n % x == 1) return x // 나머지가 1이면 즉시 반환
        }
        return n - 1 // 항상 정답이 존재하므로 예외처리는 필요 없음
    }
}