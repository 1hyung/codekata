class Solution {
    // 놀이기구의 총 금액을 계산하고 부족 금액을 반환하는 함수
    fun solution(price: Int, money: Int, count: Int): Long =
        maxOf( // 부족 금액이 0보다 작으면 0 반환
            0, 
            (1..count) // 1부터 count까지의 범위 생성
                .sumOf { it.toLong() * price } // 각 회차별 금액(it * price)의 합을 계산
                - money // 현재 가진 금액을 뺀 값을 계산
        )
}