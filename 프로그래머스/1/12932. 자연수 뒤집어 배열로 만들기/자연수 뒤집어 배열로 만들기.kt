// 자연수를 뒤집어 배열로 만들기
class Solution {
    fun solution(n: Long): IntArray = // 단일 표현식 함수 사용
        n.toString()                // 숫자를 문자열로 변환: 12345 → "12345"
            .reversed()             // 문자열 뒤집기: "54321"
            .map { it.digitToInt() }  // 문자 하나씩 정수로 변환 (람다의 'it' 사용)
            .toIntArray()           // 리스트를 배열로 변환
}