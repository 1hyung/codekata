class Solution {
    fun solution(n: Int): Int = 
        (1..n) // 범위 생성
        .filter { n % it == 0 } // n을 it으로 나눌 때 0이 되는 수 필터링 (약수 필터링)
        .sum() // 약수 합산
}