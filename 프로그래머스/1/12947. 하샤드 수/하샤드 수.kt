class Solution {
    fun solution(x: Int): Boolean =
        x % x.toString() // 정수 x를 문자열로 변환 (예: 123 → "123")
            .sumOf { it.digitToInt() } == 0 
    // 문자열의 각 문자를 정수로 변환한 뒤 합산 (예: "123" → 1 + 2 + 3 = 6)
    // x가 자릿수 합으로 나누어 떨어지는지 확인 (예: 123 % 6 == 0)
}