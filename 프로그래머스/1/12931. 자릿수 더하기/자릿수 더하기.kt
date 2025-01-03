class Solution {
    fun solution(n: Int): Int {
        return n.toString() // 정수 n을 문자열로 변환하여 각 자릿수를 분리 (예: 123 → "123")
            .sumOf {
                it.digitToInt() // 각 문자를 정수로 변환 (예: '1' → 1)
            } // 변환된 정수들의 합을 계산 sumOf
    }
}