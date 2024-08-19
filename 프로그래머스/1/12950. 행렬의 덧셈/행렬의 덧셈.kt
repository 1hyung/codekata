class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        // 새로운 행렬을 생성하여 결과를 저장
        val result = Array(arr1.size) { IntArray(arr1[0].size) }
        
        // 두 행렬을 순회하면서 덧셈 수행
        for (i in arr1.indices) {
            for (j in arr1[i].indices) {
                result[i][j] = arr1[i][j] + arr2[i][j]
            }
        }
        
        return result
    }
}
