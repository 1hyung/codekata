class Solution {
    fun solution(arr: IntArray): IntArray =
        if (arr.size == 1) intArrayOf(-1) // 배열이 한 개의 요소만 가지는 경우 [-1] 반환
        else arr.filter { it != arr.minOrNull() }.toIntArray() // 가장 작은 값을 제외하고 반환
}