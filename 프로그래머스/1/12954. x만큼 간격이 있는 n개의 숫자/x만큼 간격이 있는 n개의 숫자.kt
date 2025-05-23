// x만큼 간격이 있는 n개의 숫자
class Solution {
    fun solution(x: Int, n: Int): LongArray =
        (1..n) // 1부터 n까지 반복
            .map { x.toLong() * it } // 각 숫자에 x를 곱함 -> Long 타입으,로 변환하여 오버플로 방지
            .toLongArray() // List<Long>을 LongArray로 변환하여 반환
}