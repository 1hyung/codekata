class Solution {
    fun solution(m: Int, n: Int, startX: Int, startY: Int, balls: Array<IntArray>): IntArray {
        return balls.map { ball -> getMinDistance(m, n, startX, startY, ball) }.toIntArray()
    }

    private fun getMinDistance(width: Int, height: Int, startX: Int, startY: Int, ball: IntArray): Int {
        var minDistance = Int.MAX_VALUE

        // 아래 방향으로 삼각형을 그려 최소 거리 계산
        if (!(ball[0] == startX && ball[1] < startY)) {
            minDistance = minOf(minDistance, calculateSquaredDistance(startX, startY, ball[0], -ball[1]))
        }

        // 위 방향으로 삼각형을 그려 최소 거리 계산
        if (!(ball[0] == startX && ball[1] > startY)) {
            minDistance = minOf(minDistance, calculateSquaredDistance(startX, startY, ball[0], 2 * height - ball[1]))
        }

        // 왼쪽 방향으로 삼각형을 그려 최소 거리 계산
        if (!(ball[1] == startY && ball[0] < startX)) {
            minDistance = minOf(minDistance, calculateSquaredDistance(startX, startY, -ball[0], ball[1]))
        }

        // 오른쪽 방향으로 삼각형을 그려 최소 거리 계산
        if (!(ball[1] == startY && ball[0] > startX)) {
            minDistance = minOf(minDistance, calculateSquaredDistance(startX, startY, 2 * width - ball[0], ball[1]))
        }

        return minDistance
    }

    private fun calculateSquaredDistance(startX: Int, startY: Int, targetX: Int, targetY: Int): Int {
        val dx = startX - targetX
        val dy = startY - targetY
        return dx * dx + dy * dy
    }
}