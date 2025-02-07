import kotlin.collections.*

class Solution {
    fun solution(numbers: IntArray): IntArray {
        return numbers.indices
            .flatMap { i -> (i + 1 until numbers.size).map { j -> numbers[i] + numbers[j] } }
            .toSet() // 중복 제거
            .sorted() // 정렬
            .toIntArray()
    }
}