// 자릿수 더하기
class Solution {
    fun solution(n: Int): Int =
        n.toString() // 숫자를 문자열로 변환 (예: 123 → "123")
            .sumOf { it.digitToInt() } // 각 문자를 숫자로 변환 후 합산
}