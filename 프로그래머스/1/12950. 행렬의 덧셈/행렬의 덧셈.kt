class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        return arr1.mapIndexed { i, row -> // 각 행을 처리
            row.mapIndexed { j, value -> // 각 열을 처리
                value + arr2[i][j] // 같은 위치의 값을 더함
            }.toIntArray() // 행을 IntArray로 변환
        }.toTypedArray() // 전체 결과를 Array<IntArray>로 변환
    }
}