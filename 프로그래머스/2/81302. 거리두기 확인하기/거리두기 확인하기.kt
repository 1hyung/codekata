class Solution {
    private val directions = arrayOf(
        intArrayOf(0, 1), intArrayOf(1, 0), intArrayOf(0, -1), intArrayOf(-1, 0)
    )
    private val diagonalDirections = arrayOf(
        intArrayOf(1, 1), intArrayOf(1, -1), intArrayOf(-1, 1), intArrayOf(-1, -1)
    )

    fun solution(places: Array<Array<String>>): IntArray {
        return places.map { place ->
            if (isValidPlace(place)) 1 else 0
        }.toIntArray()
    }

    private fun isValidPlace(place: Array<String>): Boolean {
        for (i in place.indices) {
            for (j in place[i].indices) {
                if (place[i][j] == 'P') {
                    if (!isSafe(place, i, j)) return false
                }
            }
        }
        return true
    }

    private fun isSafe(place: Array<String>, x: Int, y: Int): Boolean {
        // 직선 방향으로 거리 1 체크
        for (dir in directions) {
            val nx = x + dir[0]
            val ny = y + dir[1]
            if (nx in 0 until 5 && ny in 0 until 5 && place[nx][ny] == 'P') {
                return false
            }
        }

        // 직선 방향으로 거리 2 체크
        for (dir in directions) {
            val nx = x + dir[0] * 2
            val ny = y + dir[1] * 2
            if (nx in 0 until 5 && ny in 0 until 5 && place[nx][ny] == 'P' &&
                place[x + dir[0]][y + dir[1]] != 'X') {
                return false
            }
        }

        // 대각선 방향 체크
        for (dir in diagonalDirections) {
            val nx = x + dir[0]
            val ny = y + dir[1]
            if (nx in 0 until 5 && ny in 0 until 5 && place[nx][ny] == 'P') {
                if (!(place[x][ny] == 'X' && place[nx][y] == 'X')) {
                    return false
                }
            }
        }

        return true
    }
}