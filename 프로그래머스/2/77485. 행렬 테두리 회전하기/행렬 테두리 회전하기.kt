class Solution {
    fun solution(rows: Int, columns: Int, queries: Array<IntArray>): List<Int> {
        // 1. 행렬 초기화
        val matrix = Array(rows) { i -> IntArray(columns) { j -> i * columns + j + 1 } }
        val result = mutableListOf<Int>() // 각 회전에서의 최솟값을 저장할 리스트

        // 2. 테두리 회전을 수행
        for (query in queries) {
            val (x1, y1, x2, y2) = query.map { it - 1 } // 1부터 시작하므로 0 기반으로 변환
            var minVal = Int.MAX_VALUE // 회전 중 가장 작은 값을 저장할 변수

            // 테두리 회전 시작
            var prev = matrix[x1][y1] // 테두리 첫 값을 저장

            // 왼쪽 테두리 이동
            for (x in x1 until x2) {
                matrix[x][y1] = matrix[x + 1][y1].also { minVal = minOf(minVal, it) }
            }

            // 하단 테두리 이동
            for (y in y1 until y2) {
                matrix[x2][y] = matrix[x2][y + 1].also { minVal = minOf(minVal, it) }
            }

            // 오른쪽 테두리 이동
            for (x in x2 downTo x1 + 1) {
                matrix[x][y2] = matrix[x - 1][y2].also { minVal = minOf(minVal, it) }
            }

            // 상단 테두리 이동
            for (y in y2 downTo y1 + 1) {
                matrix[x1][y] = matrix[x1][y - 1].also { minVal = minOf(minVal, it) }
            }

            matrix[x1][y1 + 1] = prev // 첫 번째 값은 마지막 위치로 이동
            minVal = minOf(minVal, prev) // 마지막으로 첫 번째 값 확인
            result.add(minVal) // 현재 회전에서의 최솟값을 결과 리스트에 추가
        }
        
        return result
    }
}