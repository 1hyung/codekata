class Solution {
    fun solution(food: IntArray): String {
        val sb = StringBuilder() // 좌측 음식 나열 저장용

        for (i in 1 until food.size) {
            val count = food[i] / 2 // 양쪽으로 나눠 가질 수 있는 수
            repeat(count) { sb.append(i) } // 반복해서 추가
        }

        val left = sb.toString()
        return left + "0" + left.reversed() // 가운데 물 추가하고 대칭
    }
}