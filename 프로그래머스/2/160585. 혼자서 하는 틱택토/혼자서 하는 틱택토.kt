class Solution {
    fun solution(board: Array<String>): Int {
        val oCount = board.sumOf { row -> row.count { it == 'O' } }
        val xCount = board.sumOf { row -> row.count { it == 'X' } }

        // 조건 1: 개수 규칙
        if (xCount > oCount || oCount > xCount + 1) return 0

        // 조건 2: 승리 여부
        val oWin = checkWin(board, 'O')
        val xWin = checkWin(board, 'X')

        // 조건 3: 둘 다 승리하거나 승리와 개수 불일치
        if (oWin && xWin) return 0
        if (oWin && oCount != xCount + 1) return 0
        if (xWin && oCount != xCount) return 0

        // 모두 만족하면 1
        return 1
    }

    private fun checkWin(board: Array<String>, char: Char): Boolean {
        // 가로 승리
        for (row in board) {
            if (row.all { it == char }) return true
        }

        // 세로 승리
        for (col in 0 until 3) {
            if ((0 until 3).all { row -> board[row][col] == char }) return true
        }

        // 대각선 승리
        if ((0 until 3).all { i -> board[i][i] == char }) return true
        if ((0 until 3).all { i -> board[i][2 - i] == char }) return true

        return false
    }
}