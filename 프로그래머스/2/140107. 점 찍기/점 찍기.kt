import kotlin.math.sqrt

class Solution {
    fun solution(k: Int, d: Int): Long {
        var count = 0L
        val maxDistanceSquared = d.toLong() * d.toLong() // d^2 계산

        // x 좌표를 k의 배수로 증가시킴
        for (x in 0..d step k) {
            val xSquared = x.toLong() * x.toLong()
            val maxYSquared = maxDistanceSquared - xSquared
            
            // 가능한 y의 최대값을 계산하고, k의 배수로 가능한 점 개수를 계산
            val maxY = sqrt(maxYSquared.toDouble()).toLong()
            count += (maxY / k) + 1
        }

        return count
    }
}