import kotlin.math.abs
import kotlin.math.pow

class Solution {
    fun solution(n: Int, l: Long, r: Long): Int {
        return count(n, r) - count(n, l - 1)
    }

    private fun count(n: Int, k: Long): Int {
        if (n == 0) return 1

        val prevBitStringNumber = n - 1
        val divisor = 5.0.pow(prevBitStringNumber).toLong() // 각 구간의 길이
        val numberOf1s = 4.0.pow(prevBitStringNumber).toInt() // 이전 비트열의 1의 개수

        var zone = abs(k / divisor).toInt()   // k번째 위치가 속한 구간 인덱스 (0 ~ 4)
        if (k % divisor == 0L) zone -= 1

        // 0만 있는 구간
        if (zone == 2) return numberOf1s * zone
        // 0 이후 구간
        if (zone > 2) return numberOf1s * (zone - 1) + count(n - 1, k - (divisor * zone))
        // 0 이전 구간
        return numberOf1s * zone + count(n - 1, k - (divisor * zone))
    }
}