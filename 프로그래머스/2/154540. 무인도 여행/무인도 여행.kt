class Solution {
    fun solution(maps: Array<String>): List<Int> {
        val rows = maps.size
        val cols = maps[0].length
        val visited = Array(rows) { BooleanArray(cols) } // 방문 여부를 기록하는 배열
        val result = mutableListOf<Int>() // 각 섬에서 머무를 수 있는 최대 일수를 저장할 리스트

        // 상하좌우 이동을 위한 좌표
        val directions = arrayOf(Pair(-1, 0), Pair(1, 0), Pair(0, -1), Pair(0, 1))

        fun bfs(x: Int, y: Int): Int {
            var totalFood = 0
            val queue = ArrayDeque<Pair<Int, Int>>()
            queue.add(Pair(x, y))
            visited[x][y] = true

            while (queue.isNotEmpty()) {
                val (currentX, currentY) = queue.removeFirst()
                totalFood += maps[currentX][currentY].toString().toInt()

                // 상하좌우 탐색
                for (dir in directions) {
                    val newX = currentX + dir.first
                    val newY = currentY + dir.second

                    if (newX in 0 until rows && newY in 0 until cols &&
                        maps[newX][newY] != 'X' && !visited[newX][newY]) {
                        queue.add(Pair(newX, newY))
                        visited[newX][newY] = true
                    }
                }
            }
            return totalFood
        }

        // 모든 위치에서 BFS 실행
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                if (maps[i][j] != 'X' && !visited[i][j]) {
                    val islandFood = bfs(i, j) // BFS로 연결된 섬의 식량 합 계산
                    result.add(islandFood)
                }
            }
        }

        return if (result.isEmpty()) listOf(-1) else result.sorted()
    }
}