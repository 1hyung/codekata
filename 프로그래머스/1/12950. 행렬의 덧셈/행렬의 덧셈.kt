class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> =
        arr1.zip(arr2) { row1, row2 ->  // 각 행을 쌍으로 묶음
            row1.zip(row2) { a, b -> a + b }.toIntArray() // 각 열을 쌍으로 묶어 덧셈
        }.toTypedArray() // 최종적으로 2차원 배열로 변환
}