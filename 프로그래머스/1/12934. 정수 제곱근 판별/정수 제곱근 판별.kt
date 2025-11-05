// 정수 제곱근 판별
import kotlin.math.sqrt

class Solution {
    fun solution(n: Long): Long {
        val root = sqrt(n.toDouble())

        return if (root % 1 == 0.0) {
            val next = (root + 1).toLong()
            next * next
        } else {
            -1
        }
    }
}