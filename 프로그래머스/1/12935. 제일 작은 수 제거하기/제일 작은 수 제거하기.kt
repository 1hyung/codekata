// 제일 작은 수 제거하기
class Solution {
    fun solution(arr: IntArray): IntArray =
        arr.filter { it != arr.minOrNull() } // 가장 작은 값 제외
           .ifEmpty { listOf(-1) } // 빈 배열이면 [-1] 반환
           .toIntArray() // List<Int>를 IntArray로 변환
}