class Solution {
    fun solution(s: String): String {
        // 공백을 유지한 채 단어별로 처리하기 위해 전체 문자열을 한 글자씩 순회합니다.
        return s.split(" ").joinToString(" ") { word ->
            if (word.isNotEmpty()) {
                // 첫 문자는 대문자로, 나머지는 소문자로 변환합니다.
                word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase()
            } else {
                ""
            }
        }
    }
}
