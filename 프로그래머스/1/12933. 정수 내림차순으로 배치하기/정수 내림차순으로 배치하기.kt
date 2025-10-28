// 정수 내림차순으로 배치하기
class Solution {
    fun solution(n: Long): Long =
        n.toString().map { it } // 각 문자를 리스트로 변환
            .sortedDescending() // 내림차순 정렬
            .joinToString("") // 문자열로 변환
            .toLong() // 숫자로 변환
}