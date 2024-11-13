import java.util.LinkedList
import java.util.Queue

class Solution {
    data class Position(val x: Int, val y: Int, val moves: Int) // 위치와 이동 횟수를 저장하는 데이터 클래스

    fun solution(board: Array<String>): Int {
        val rows = board.size
        val cols = board[0].length

        var startX = -1
        var startY = -1
        var goalX = -1
        var goalY = -1

        // 시작점(R)과 목표점(G) 위치를 찾음
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                when (board[i][j]) {
                    'R' -> {
                        startX = i
                        startY = j
                    }
                    'G' -> {
                        goalX = i
                        goalY = j
                    }
                }
            }
        }

        val directions = arrayOf(
            intArrayOf(-1, 0),  // 상
            intArrayOf(1, 0),   // 하
            intArrayOf(0, -1),  // 좌
            intArrayOf(0, 1)    // 우
        )

        val visited = Array(rows) { BooleanArray(cols) }
        val queue: Queue<Position> = LinkedList()
        queue.add(Position(startX, startY, 0)) // 시작 위치에서 BFS 시작
        visited[startX][startY] = true

        while (queue.isNotEmpty()) {
            val (x, y, moves) = queue.poll()

            // 목표 위치에 도달하면 이동 횟수 반환
            if (x == goalX && y == goalY) return moves

            for (dir in directions) {
                var nx = x
                var ny = y

                // 현재 방향으로 이동할 수 있는 최대 위치까지 이동
                while (nx + dir[0] in 0 until rows && ny + dir[1] in 0 until cols && board[nx + dir[0]][ny + dir[1]] != 'D') {
                    nx += dir[0]
                    ny += dir[1]
                }

                // 방문하지 않은 위치만 추가
                if (!visited[nx][ny]) {
                    visited[nx][ny] = true
                    queue.add(Position(nx, ny, moves + 1))
                }
            }
        }

        // BFS가 끝날 때까지 목표 위치에 도달하지 못한 경우
        return -1
    }
}