class Solution {
    fun solution(n: Int): Int = 
        (1 .. n).filter { n % it == 0} // 약수만 필터링
            .sum() // 약수들의 합 계산
}