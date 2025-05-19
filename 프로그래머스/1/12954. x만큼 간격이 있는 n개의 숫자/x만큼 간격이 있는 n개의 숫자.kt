class Solution {
    fun solution(x: Int, n: Int): LongArray =
        (1..n) // 1부터 n까지 범위 생성
            .map { x.toLong() * it } // 각 숫자에 it에 대해 x * it 값을 리스트에 저장
            .toLongArray() // List<Long>을 LongArray로 변환
}