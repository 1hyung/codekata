class Solution {
    fun solution(numbers: IntArray): Int =
        (0..9).filter { it !in numbers }.sum() // 0~9 중 numbers에 없는 숫자를 필터링하여 합산
}