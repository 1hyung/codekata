// 자연수 뒤집어 배열로 만들기
class Solution {
    fun solution(n: Long): IntArray =
        n.toString()  // 숫자를 문자열로 변환: 12345 → "12345"
            .reversed()  // 문자열 뒤집기: "12345" → "54321"
            .map { it.digitToInt() } // 각 문자(Char)를 정수로 변환: ['5','4','3','2','1'] → [5,4,3,2,1]
            .toIntArray() // 리스트를 IntArray로 변환
}