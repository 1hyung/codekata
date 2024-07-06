import java.util.*

class Solution {
    val size = 5
    val dx = arrayOf(1, -1, 0, 0)
    val dy = arrayOf(0, 0, 1, -1)
    
    fun solution(places: Array<Array<String>>): IntArray {
        val ans = mutableListOf<Int>()

        places.forEach { place ->
            val result = obeyDistance(place)
            ans.add(result)
        }

        return ans.toIntArray()
    }

    private fun obeyDistance(place: Array<String>): Int {
        for (i in place.indices) {
            for (j in place[i].indices) {
                if (place[i][j] == 'P') {
                    if (!bfs(place, i, j)) {
                        return 0
                    }
                }
            }
        }
        return 1
    }

    private fun bfs(place: Array<String>, startX: Int, startY: Int): Boolean {
        val q: Queue<Pair<Int, Int>> = LinkedList()
        q.add(Pair(startX, startY))
        val board = Array(size) { Array(size) { 0 } }

        while (q.isNotEmpty()) {
            val (curX, curY) = q.poll()
            val distance = board[curX][curY] + 1

            if (distance > 2) {
                continue
            }

            for (i in dx.indices) {
                val nx = curX + dx[i]
                val ny = curY + dy[i]

                if (!isIn(nx, ny)) continue
                if (nx == startX && ny == startY) continue

                if (place[nx][ny] != 'X' && board[nx][ny] == 0) {
                    q.add(Pair(nx, ny))
                    board[nx][ny] = distance
                }

                if (place[nx][ny] == 'P' && board[nx][ny] <= 2) {
                    return false
                }
            }
        }
        return true
    }

    private fun isIn(x: Int, y: Int): Boolean = (x in 0 until size && y in 0 until size)
}
