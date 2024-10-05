class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        val rowA = arr1.size // arr1의 행 개수
        val colA = arr1[0].size // arr1의 열 개수
        val colB = arr2[0].size // arr2의 열 개수

        // 결과 행렬을 초기화 (크기는 rowA x colB)
        val result = Array(rowA) { IntArray(colB) }

        // 행렬 곱셈
        for (i in 0 until rowA) { // arr1의 각 행에 대해 반복
            for (j in 0 until colB) { // arr2의 각 열에 대해 반복
                var sum = 0
                for (k in 0 until colA) { // arr1의 열 개수이자 arr2의 행 개수만큼 반복
                    sum += arr1[i][k] * arr2[k][j]
                }
                result[i][j] = sum // 결과 행렬에 값 저장
            }
        }

        return result
    }
}
