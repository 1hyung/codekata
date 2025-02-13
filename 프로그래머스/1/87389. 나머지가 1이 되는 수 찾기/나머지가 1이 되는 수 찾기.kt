class Solution {
    fun solution(n: Int): Int {
        for (x in 2 until n) { // 2부터 n-1까지 반복
            if (n % x == 1) { // n을 x로 나눈 나머지가 1인지 확인
                return x // 가장 먼저 조건을 만족하는 x 반환
            }
        }
        return n - 1 // 일반적으로 실행되지 않지만, 조건을 만족하는 x가 없을 경우 n-1 반환
    }
}