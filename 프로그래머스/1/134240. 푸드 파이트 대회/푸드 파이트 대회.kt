class Solution {
    fun solution(food: IntArray): String {
        val left = food.mapIndexed { i, count -> "$i".repeat(count / 2) }
                       .joinToString("") // 모든 부분을 문자열로 결합

        return left + "0" + left.reversed() // 중앙 물(0) 추가 후 대칭 문자열 완성
    }
}