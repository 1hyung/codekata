class Solution {
    fun solution(s: String): String =
        if (s.length % 2 == 0) // 문자열 길이가 짝수인 경우
            s.substring(s.length / 2 - 1, s.length / 2 + 1) // 가운데 두 글자
        else // 문자열 길이가 홀수인 경우
            s.substring(s.length / 2, s.length / 2 + 1) // 가운데 한 글자
}