class Solution {
    fun solution(ingredient: IntArray): Int {
        val stack = mutableListOf<Int>()
        var count = 0

        for (item in ingredient) {
            stack.add(item)
            // 스택의 마지막 4개가 [1, 2, 3, 1]이면 햄버거 포장
            if (stack.size >= 4 && stack.takeLast(4) == listOf(1, 2, 3, 1)) {
                count++
                repeat(4) { stack.removeAt(stack.size - 1) } // 마지막 4개 제거
            }
        }
        return count
    }
}
