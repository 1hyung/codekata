class Solution {
    fun solution(x: Int, n: Int): LongArray =
        (1..n).map { x.toLong() * it }.toLongArray() // 1부터 n까지 반복하며 x * it 계산
}