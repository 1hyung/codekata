class Solution {
    fun solution(s: String): String {
        val numbers = s.split(" ").map { it.toInt() }
        val min = numbers.minOf { it }
        val max = numbers.maxOf { it }
        return "$min $max"
    }
}