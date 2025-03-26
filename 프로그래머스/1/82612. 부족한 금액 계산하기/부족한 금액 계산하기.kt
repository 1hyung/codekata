class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        val total = price.toLong() * count * (count + 1) / 2 // 총 이용료 계산
        return if (money >= total) 0 else total - money // 부족하면 차이 반환, 아니면 0
    }
}