class Solution {
    fun solution(line: Array<IntArray>): Array<String> {
        val points = mutableListOf<Pair<Long, Long>>()

        // 교점 계산
        for (i in line.indices) {
            for (j in i + 1 until line.size) {
                val (a1, b1, c1) = line[i]
                val (a2, b2, c2) = line[j]
                val denominator = a1.toLong() * b2 - a2.toLong() * b1

                if (denominator == 0L) continue // 평행 또는 일치

                val xNumerator = b1.toLong() * c2 - b2.toLong() * c1
                val yNumerator = c1.toLong() * a2 - c2.toLong() * a1

                if (xNumerator % denominator == 0L && yNumerator % denominator == 0L) {
                    val x = xNumerator / denominator
                    val y = yNumerator / denominator
                    points.add(Pair(x, y))
                }
            }
        }

        // 격자 크기 계산
        val minX = points.minOf { it.first }
        val maxX = points.maxOf { it.first }
        val minY = points.minOf { it.second }
        val maxY = points.maxOf { it.second }

        val width = (maxX - minX + 1).toInt()
        val height = (maxY - minY + 1).toInt()

        // 격자 생성 및 별 찍기
        val grid = Array(height) { CharArray(width) { '.' } }

        for ((x, y) in points) {
            val gridX = (x - minX).toInt()
            val gridY = (maxY - y).toInt() // y 좌표 반전
            grid[gridY][gridX] = '*'
        }

        return grid.map { String(it) }.toTypedArray()
    }
}