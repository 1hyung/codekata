// 없는 숫자 더하기

class Solution {
    fun solution(numbers: IntArray): Int =
        (0..9).filter { it !in numbers }.sum() // 0~9 중 numbers에 없는 숫자 필터링 후 합산
}