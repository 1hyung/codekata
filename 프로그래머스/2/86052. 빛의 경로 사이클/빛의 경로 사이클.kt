class Solution {
    private val xAxisDir = arrayOf(0, -1, 0, 1) // 좌, 상, 우, 하
    private val yAxisDir = arrayOf(-1, 0, 1, 0)

    private val directionCount = 4
    private var rowCount: Int = 0
    private var colCount: Int = 0

    private lateinit var visited: Array<Array<BooleanArray>>

    fun solution(grid: Array<String>): IntArray {
        rowCount = grid.size
        colCount = grid[0].length

        // 각 칸에 대해 4방향 방문 여부를 기록
        visited = Array(rowCount) { Array(colCount) { BooleanArray(directionCount) { false } } }

        val result = mutableListOf<Int>()

        // 모든 칸과 모든 방향에서 경로 추적
        for (row in 0 until rowCount) {
            for (col in 0 until colCount) {
                for (dir in 0 until directionCount) {
                    if (!visited[row][col][dir]) {
                        result.add(traceCycle(grid, row, col, dir))
                    }
                }
            }
        }

        return result.sorted().toIntArray()
    }

    private fun traceCycle(grid: Array<String>, startRow: Int, startCol: Int, startDir: Int): Int {
        var length = 0
        var (row, col, dir) = Triple(startRow, startCol, startDir)

        while (!visited[row][col][dir]) {
            visited[row][col][dir] = true // 현재 위치와 방향 방문 처리
            length++

            // 방향 변경 및 이동
            dir = getNextDirection(grid[row][col], dir)
            row = (row + yAxisDir[dir] + rowCount) % rowCount
            col = (col + xAxisDir[dir] + colCount) % colCount
        }

        return length
    }

    private fun getNextDirection(cell: Char, currentDir: Int): Int {
        return when (cell) {
            'L' -> (currentDir + 3) % 4 // 좌회전
            'R' -> (currentDir + 1) % 4 // 우회전
            else -> currentDir // 직진
        }
    }
}