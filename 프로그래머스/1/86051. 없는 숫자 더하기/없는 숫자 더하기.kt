class Solution {
    fun solution(numbers: IntArray): Int =
        (0..9).sum() - numbers.sum() // 전체 숫자 합(45)에서 numbers의 합을 뺌
}