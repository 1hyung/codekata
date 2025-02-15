class Solution {
    fun solution(n: Long): IntArray {
        return n.toString() // 1. 숫자를 문자열로 변환 (예: 12345 → "12345")
            .reversed() // 2. 문자열을 뒤집음 (예: "12345" → "54321")
            .map { it.digitToInt() } // 3. 각 문자를 정수로 변환 (예: ['5', '4', '3', '2', '1'] → [5, 4, 3, 2, 1])
            .toIntArray() // 4. 리스트를 IntArray로 변환하여 반환
    }
}