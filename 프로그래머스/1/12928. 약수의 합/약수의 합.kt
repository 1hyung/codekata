class Solution {
    fun solution(n: Int): Int =
        (1..n) // 1부터 n까지 범위 생성
        .filter { n % it == 0 } // n부터 it으로 나눈 나머지가 0인 값만 남김 -> 약수 필터링
        .sum() // 약수들의 합 계산
}