class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        val rows = arr1.size       // 행(row)의 개수
        val cols = arr1[0].size    // 열(column)의 개수

        val answer = Array(rows) { IntArray(cols) } // 결과 행렬 초기화

        for (i in 0 until rows) {      // 행을 반복
            for (j in 0 until cols) {  // 열을 반복
                answer[i][j] = arr1[i][j] + arr2[i][j] // 같은 위치의 원소를 더함
            }
        }

        return answer // 결과 행렬 반환
    }
}