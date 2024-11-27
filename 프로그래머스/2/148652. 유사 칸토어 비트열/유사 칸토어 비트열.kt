import kotlin.math.abs
import kotlin.math.pow

class Solution {
    fun solution(n: Int, l: Long, r: Long): Int {
        return count(n, r) - count(n, l - 1)
    }
    
    private fun count(n: Int, k: Long): Int {
        if (n == 0) return 1

        val prevBitStringNumber = n - 1
        val divisor = 5.0.pow(prevBitStringNumber).toLong() // 5등분으로 나누는 수
        val numberOf1s = 4.0.pow(prevBitStringNumber).toInt() // 이전 비트열 1의 개수

        var zone = abs(k / divisor).toInt()   // k번째가 속한 구역(0, 1, 2, 3, 4)
        if (k % divisor == 0L) zone -= 1

        // 0만 있는 구역
        if (zone == 2) return numberOf1s * zone
        // 0 이후 구역
        if (zone > 2) return numberOf1s * (zone - 1) + count(n - 1, k - (divisor * zone))
        // 0 이전 구역
        return numberOf1s * zone + count(n - 1, k - (divisor * zone))
    }
}