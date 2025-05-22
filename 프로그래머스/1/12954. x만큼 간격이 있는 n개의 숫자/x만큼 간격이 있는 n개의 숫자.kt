class Solution {
    fun solution(x: Int, n: Int): LongArray =
        (1..n)                             // 1부터 n까지 반복 (it은 1부터 n까지의 인덱스 역할)
            .map { x.toLong() * it }      // 각 숫자에 대해 x를 곱함 → Long 타입으로 변환하여 오버플로 방지
            .toLongArray()                // List<Long> → LongArray로 변환하여 반환
}