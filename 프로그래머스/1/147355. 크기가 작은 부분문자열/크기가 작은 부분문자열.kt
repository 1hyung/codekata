class Solution {
    fun solution(t: String, p: String): Int {
        val pValue = p.toLong() // 비교 기준이 되는 p 값을 숫자로 변환
        return t.windowed(p.length) // p의 길이만큼 부분 문자열 리스트 생성
            .count { it.toLong() <= pValue } // 변환 후 p보다 작거나 같은 개수 세기
    }
}