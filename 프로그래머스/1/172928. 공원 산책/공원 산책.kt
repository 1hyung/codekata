class Solution {
    fun solution(park: Array<String>, routes: Array<String>): IntArray {
        var answer = intArrayOf(0, 0)
        val order = mapOf(
            "N" to intArrayOf(-1, 0),
            "S" to intArrayOf(1, 0),
            "W" to intArrayOf(0, -1),
            "E" to intArrayOf(0, 1)
        )

        loop@ for (i in park.indices) {
            for (j in park[i].indices) {
                if (park[i][j] == 'S') {
                    answer = intArrayOf(i, j)
                    break@loop
                }
            }
        }

        routes.forEach {
            val parts = it.split(" ")
            val move = order[parts[0]]!!
            val count = parts[1].toInt()
            var nr = answer[0]
            var nc = answer[1]

            for (i in 1..count) {
                nr += move[0]
                nc += move[1]
                if (nr !in park.indices || nc !in park[0].indices || park[nr][nc] == 'X') {
                    nr = answer[0]
                    nc = answer[1]
                    break
                }
            }
            answer[0] = nr
            answer[1] = nc
        }

        return answer
    }
}