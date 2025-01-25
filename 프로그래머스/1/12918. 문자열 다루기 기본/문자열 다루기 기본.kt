class Solution {
    fun solution(s: String): Boolean {
        return (s.length == 4 || s.length == 6) // 길이가 4 또는 6인지 확인
                && s.all { it.isDigit() } // 모든 문자가 숫자인지 확인
    }
}