class Solution {
    fun solution(s: String): String {
        val len = s.length
        return if (len % 2 == 0) {
            // 문자열의 길이가 짝수인 경우, 가운데 두 글자를 반환
            s.substring(len / 2 - 1, len / 2 + 1)
        } else {
            // 문자열의 길이가 홀수인 경우, 가운데 한 글자를 반환
            s.substring(len / 2, len / 2 + 1)
        }
    }
}
