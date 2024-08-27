class Solution {
    fun solution(s: String): Int {
        // 숫자와 영단어를 매핑한 맵 생성
        val numberWords = mapOf(
            "zero" to "0",
            "one" to "1",
            "two" to "2",
            "three" to "3",
            "four" to "4",
            "five" to "5",
            "six" to "6",
            "seven" to "7",
            "eight" to "8",
            "nine" to "9"
        )

        var result = s

        // 영단어를 숫자로 치환
        for ((word, digit) in numberWords) {
            result = result.replace(word, digit)
        }

        // 결과 문자열을 정수로 변환하여 반환
        return result.toInt()
    }
}
