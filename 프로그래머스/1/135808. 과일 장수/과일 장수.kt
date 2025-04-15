class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        val sorted = score.sortedDescending()
        var total = 0

        for (i in m - 1 until sorted.size step m) {
            total += sorted[i] * m // m번째 마다 최솟값 (내림차순 기준)
        }

        return total
    }
}