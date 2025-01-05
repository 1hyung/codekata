class Solution {
    fun solution(x: Int, n: Int): LongArray =
        (1..n).map { x.toLong() * it }.toLongArray() // x를 Long으로 변환하여 범위의 각 요소와 곱하고 LongArray로 변환
}