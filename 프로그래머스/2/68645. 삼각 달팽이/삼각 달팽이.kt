class Solution {
    fun solution(n: Int): IntArray {
        // n x n 크기의 2차원 배열을 초기화
        val triangle = Array(n) { IntArray(it + 1) }
        val resultSize = n * (n + 1) / 2  // 삼각형 전체 요소의 개수
        val result = IntArray(resultSize)
        
        // 방향: 아래(0), 오른쪽(1), 위(2)
        val dx = intArrayOf(1, 0, -1)
        val dy = intArrayOf(0, 1, -1)

        var num = 1
        var x = 0
        var y = 0
        var direction = 0

        // 삼각형 내부에 숫자를 채워나가는 루프
        while (num <= resultSize) {
            triangle[x][y] = num
            num++
            
            // 다음 위치 계산
            val nx = x + dx[direction]
            val ny = y + dy[direction]

            // 범위를 벗어나거나 이미 값이 채워진 경우 방향 전환
            if (nx !in 0 until n || ny !in 0..nx || triangle[nx][ny] != 0) {
                direction = (direction + 1) % 3
            }

            // 방향에 따라 현재 위치 업데이트
            x += dx[direction]
            y += dy[direction]
        }

        // 1차원 배열로 변환
        var index = 0
        for (i in 0 until n) {
            for (j in 0..i) {
                result[index++] = triangle[i][j]
            }
        }

        return result
    }
}