// 나누어 떨어지는 숫자 배열

class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray =
        arr.filter { it % divisor == 0 }       // 나누어 떨어지는 값 필터링
           .sorted()                           // 오름차순 정렬
           .ifEmpty { listOf(-1) }             // 비어 있으면 [-1] 반환
           .toIntArray()                       // List<Int> → IntArray 변환
}