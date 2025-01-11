class Solution {
    fun solution(a: Int, b: Int): Long =
         (minOf(a, b)..maxOf(a, b)) // a와 b 사이의 범위를 생성 (작은 값부터 큰 값까지)
            .sumOf{ it.toLong() }  // 각 정수를 Long으로 변환하여 합산
}