class Solution {
    fun solution(k: Int, ranges: Array<IntArray>): DoubleArray {
        // 1. 우박수열 생성
        val hailstone = mutableListOf(k)
        while (hailstone.last() > 1) {
            val next = if (hailstone.last() % 2 == 0) hailstone.last() / 2 else hailstone.last() * 3 + 1
            hailstone.add(next)
        }

        // 2. 구간 면적 계산
        val areas = mutableListOf<Double>()
        for (i in 0 until hailstone.size - 1) {
            areas.add((hailstone[i] + hailstone[i + 1]) / 2.0)
        }

        // 3. 누적합 계산
        val prefixSum = DoubleArray(areas.size + 1)
        for (i in areas.indices) {
            prefixSum[i + 1] = prefixSum[i] + areas[i]
        }

        // 4. 쿼리 처리
        val result = DoubleArray(ranges.size)
        val n = hailstone.size - 1
        for (i in ranges.indices) {
            val (a, b) = ranges[i]
            val end = n + b
            if (a > end) {
                result[i] = -1.0
            } else {
                result[i] = prefixSum[end] - prefixSum[a]
            }
        }

        return result
    }
}