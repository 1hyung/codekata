class Solution {
    // 단일 표현식 함수
    fun solution(n: Int): Int =
        (1..n).filter { n % it == 0} // 약수 필터링
            .sum() // 약수들의 합 계산
}