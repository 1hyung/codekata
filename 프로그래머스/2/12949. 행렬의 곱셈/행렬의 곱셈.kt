class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        return Array(arr1.size) { i ->
            IntArray(arr2[0].size) { j ->
                var value = 0
                for (k in arr2.indices) {
                    value += arr1[i][k] * arr2[k][j]
                }
                value
            }
        }
    }
}