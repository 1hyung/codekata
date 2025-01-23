class Solution {
    fun solution(s: String): String {
        return s.toCharArray()     // 문자열을 문자 배열로 변환
            .sortedDescending()    // 문자 배열을 내림차순으로 정렬 (대문자는 소문자보다 작은 것으로 간주)
            .joinToString("")      // 정렬된 문자 배열을 빈 구분자로 결합하여 문자열로 변환
    }
}
