class Solution {
    fun solution(food: IntArray): String {
        val leftSide = StringBuilder()

        // 좌측과 우측 배치할 음식 생성
        for (i in 1 until food.size) {
            val count = food[i] / 2
            leftSide.append(i.toString().repeat(count))
        }

        // 중앙에 물(0)을 배치하고, 우측은 좌측을 반대로 붙이기
        val result = leftSide.toString() + "0" + leftSide.reverse().toString()
        return result
    }
}
