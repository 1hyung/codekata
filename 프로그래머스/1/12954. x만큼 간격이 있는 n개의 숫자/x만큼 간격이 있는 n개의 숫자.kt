class Solution {
    fun solution(x: Int, n: Int): LongArray =
        (1..n).map { x.toLong() * it} // 1부터 n까지 반복하여 x의 배수 생성
            .toLongArray() // 리스트를 LongArray로 변환
}