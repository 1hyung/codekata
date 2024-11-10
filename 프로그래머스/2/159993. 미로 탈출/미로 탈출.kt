import java.util.LinkedList
import java.util.Queue

class Solution {
    // 상하좌우 방향 정의
    private val directions = arrayOf(
        intArrayOf(-1, 0), intArrayOf(1, 0), // 위, 아래
        intArrayOf(0, -1), intArrayOf(0, 1)  // 왼쪽, 오른쪽
    )

    fun solution(maps: Array<String>): Int {
        val start = findPosition(maps, 'S')
        val lever = findPosition(maps, 'L')
        val exit = findPosition(maps, 'E')

        // 출발점에서 레버까지의 최단 거리
        val distanceToLever = bfs(maps, start, lever)
        // 레버에서 출구까지의 최단 거리
        val distanceToExit = bfs(maps, lever, exit)

        // 경로가 모두 존재하면 두 경로의 합을 반환, 아니면 -1 반환
        return if (distanceToLever != -1 && distanceToExit != -1) {
            distanceToLever + distanceToExit
        } else {
            -1
        }
    }

    // 특정 문자 위치 찾기
    private fun findPosition(maps: Array<String>, target: Char): Pair<Int, Int> {
        for (i in maps.indices) {
            for (j in maps[i].indices) {
                if (maps[i][j] == target) return Pair(i, j)
            }
        }
        throw IllegalArgumentException("Position not found") // 찾지 못한 경우 예외 발생
    }

    // BFS 함수 정의
    private fun bfs(maps: Array<String>, start: Pair<Int, Int>, end: Pair<Int, Int>): Int {
        val rows = maps.size
        val cols = maps[0].length
        val visited = Array(rows) { BooleanArray(cols) }
        val queue: Queue<Triple<Int, Int, Int>> = LinkedList() // (x, y, 거리) 형태

        queue.add(Triple(start.first, start.second, 0))
        visited[start.first][start.second] = true

        while (queue.isNotEmpty()) {
            val (x, y, dist) = queue.poll()

            if (x == end.first && y == end.second) {
                return dist // 도착 지점에 도달하면 거리 반환
            }

            // 상하좌우 탐색
            for (dir in directions) {
                val newX = x + dir[0]
                val newY = y + dir[1]

                if (newX in 0 until rows && newY in 0 until cols &&
                    !visited[newX][newY] && maps[newX][newY] != 'X') {
                    queue.add(Triple(newX, newY, dist + 1))
                    visited[newX][newY] = true
                }
            }
        }
        return -1 // 경로가 없는 경우
    }
}