class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var maxW = 0
        var maxH = 0

        for ((a, b) in sizes) {
            val w = maxOf(a, b)
            val h = minOf(a, b)

            maxW = maxOf(maxW, w)
            maxH = maxOf(maxH, h)
        }

        return maxW * maxH
    }
}