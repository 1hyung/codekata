class Solution {
    fun solution(n: Long): IntArray =
        n.toString()              // n을 문자열로 변환
            .reversed()           // 문자열을 뒤집음
            .map { it.toString().toInt() } // 각 문자를 정수로 변환
            .toIntArray()         // List를 IntArray로 변환
}