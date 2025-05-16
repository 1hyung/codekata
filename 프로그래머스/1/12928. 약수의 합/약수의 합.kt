class Solution {
    fun solution(n: Int): Int =
        (1..n) // 1부터 n까지 범위 형성
        .filter { n % it == 0 } // n을 it으로 나눴을 때 0이 되는 수 필터링 -> 약수 필터링
        .sum() // 그 수의 합
}