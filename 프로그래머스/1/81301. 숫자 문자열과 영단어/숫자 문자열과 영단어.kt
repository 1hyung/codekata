class Solution {
    fun solution(s: String): Int {
        val numberMap = mapOf(
            "zero" to "0", "one" to "1", "two" to "2", "three" to "3",
            "four" to "4", "five" to "5", "six" to "6", "seven" to "7",
            "eight" to "8", "nine" to "9"
        )

        return numberMap.entries.fold(s) { acc, (word, digit) ->
            acc.replace(word, digit) // 영단어를 숫자로 변환
        }.toInt() // 최종 변환된 문자열을 정수로 변환하여 반환
    }
}