class Solution {
    fun solution(n: Int): Int {
        // 10진수를 3진법 문자열로 변환
        val ternary = n.toString(radix = 3) // 예: 45 → "1200"
        // 3진법 문자열을 뒤집음
        val reversed = ternary.reversed() // 예: "1200" → "0021"
        // 뒤집은 3진법을 다시 10진법 정수로 변환
        return reversed.toInt(radix = 3) // 예: "0021" → 7
    }
}