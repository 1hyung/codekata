class Solution {
    fun solution(x: Int, n: Int): LongArray =
        List(n) { i -> x.toLong() * (i + 1) }.toLongArray() // 리스트를 생성 후 배열로 변환
}