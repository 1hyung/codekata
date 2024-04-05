class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var sum = 0
        signs.forEachIndexed { index, i ->
            when (i) {
                true -> sum += absolutes[index]
                else -> sum -= absolutes[index]
            }
        }
        return sum
    }
}