class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray =
        arr.filter { it % divisor == 0 } // 필터링
            .sorted() // 오름차순 정렬
            .ifEmpty { listOf(-1) } // 비어 있다면 [-1] 반환
            .toIntArray() // IntArray로 변환
}