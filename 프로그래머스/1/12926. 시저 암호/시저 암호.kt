// 시저 암호
class Solution {
    fun solution(s: String, n: Int): String =
        s.map { c ->
            when (c) {
                in 'A'..'Z' -> ((c - 'A' + n) % 26 + 'A'.code).toChar() // 대문자 처리
                in 'a'..'z' -> ((c - 'a' + n) % 26 + 'a'.code).toChar() // 소문자 처리
                else -> c // 공백이나 기타 문자는 그대로 유지
            }
        }.joinToString("")
}