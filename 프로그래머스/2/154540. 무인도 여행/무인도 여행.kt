import java.util.LinkedList
import java.util.Queue

class Solution {
    val dx = arrayOf(0, 1, 0, -1)
    val dy = arrayOf(1, 0, -1, 0)

    val answer = ArrayList<Int>()
    var visited = Array(0) { Array(0) { false } }
    var r = 0
    var c = 0
    
    fun solution(maps: Array<String>): IntArray {
        r = maps.size
        c = maps[0].length
        val map = Array(r) { CharArray(c) }
        visited = Array(r) { Array(c) { false } }
        
        for (i in 0 until r) {
            map[i] = maps[i].toCharArray()
        }

        for (i in 0 until r) {
            for (j in 0 until c) {
                if (map[i][j] != 'X' && !visited[i][j]) {
                    bfs(i, j, map)
                }
            }
        }

        if (answer.isEmpty()) return intArrayOf(-1)
        return answer.sorted().toIntArray()
    }

    fun bfs(x: Int, y: Int, map: Array<CharArray>) {
        val queue: Queue<Pair<Int, Int>> = LinkedList()
        queue.add(x to y)
        visited[x][y] = true
        var cnt = map[x][y].toString().toInt()
        
        while (queue.isNotEmpty()) {
            val now = queue.poll()

            for (i in 0 until 4) {
                val tempX = now.first + dx[i]
                val tempY = now.second + dy[i]

                if (tempX in 0 until r &&
                    tempY in 0 until c &&
                    !visited[tempX][tempY] &&
                    map[tempX][tempY] != 'X') {
                    visited[tempX][tempY] = true
                    queue.add(tempX to tempY)
                    cnt += map[tempX][tempY].toString().toInt()
                }
            }
        }
        answer.add(cnt)
    }
}
