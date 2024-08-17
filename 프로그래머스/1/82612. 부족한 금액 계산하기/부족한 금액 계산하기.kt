class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        // 총 비용 계산
        val totalCost = price.toLong() * count * (count + 1) / 2
        
        // 부족한 금액 계산
        val shortage = totalCost - money
        
        // 부족한 금액이 음수일 경우 0을 반환, 아니면 부족한 금액을 반환
        return if (shortage > 0) shortage else 0
    }
}
