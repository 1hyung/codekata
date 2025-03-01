class Solution {
    fun solution(n: Int): Int = n.toString() // 1. 정수를 문자열로 변환 (예: 123 → "123")
            .sumOf { it.digitToInt() } // 2. 각 문자를 정수로 변환 후 합산
}