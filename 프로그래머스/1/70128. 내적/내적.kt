class Solution {
    fun solution(a: IntArray, b: IntArray): Int =
        a.zip(b).sumOf { it.first * it.second } // 두 배열을 쌍으로 묶고 각 쌍의 곱을 더함
}