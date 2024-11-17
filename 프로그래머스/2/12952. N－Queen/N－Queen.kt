class Solution {
    private var count = 0

    fun solution(n: Int): Int {
        val board = IntArray(n) // 각 행의 퀸의 열 위치를 저장
        placeQueens(board, 0, n)
        return count
    }

    private fun placeQueens(board: IntArray, row: Int, n: Int) {
        if (row == n) {
            // 모든 퀸이 배치된 경우
            count++
            return
        }

        for (col in 0 until n) {
            if (isSafe(board, row, col)) {
                board[row] = col // 퀸을 배치
                placeQueens(board, row + 1, n) // 다음 행으로 이동
            }
        }
    }

    private fun isSafe(board: IntArray, row: Int, col: Int): Boolean {
        for (i in 0 until row) {
            val prevCol = board[i]
            // 같은 열에 있거나 대각선에 있는 경우
            if (prevCol == col || Math.abs(prevCol - col) == Math.abs(i - row)) {
                return false
            }
        }
        return true
    }
}