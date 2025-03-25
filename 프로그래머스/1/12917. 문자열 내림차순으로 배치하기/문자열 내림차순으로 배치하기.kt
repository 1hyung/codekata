class Solution {
    fun solution(s: String): String =
        s.toCharArray()         // 문자열을 문자 배열로 변환
            .sortedDescending() // 내림차순 정렬 (소문자 > 대문자)
            .joinToString("")   // 다시 문자열로 합치기
}