class Solution {
    fun solution(s: String): String {
        // 1. 문자열을 공백으로 나누고, 각 요소를 정수로 변환한 리스트 생성
        val numbers = s.split(" ").map { it.toInt() }
        
        // 2. 최소값과 최대값 구하기
        val minValue = numbers.minOrNull()
        val maxValue = numbers.maxOrNull()

        // 3. 최소값과 최대값을 "(최소값) (최대값)" 형태로 반환
        return "$minValue $maxValue"
    }
}
