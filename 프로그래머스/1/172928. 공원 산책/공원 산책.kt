class Solution {
    fun solution(park: Array<String>, routes: Array<String>): IntArray {
        // 공원의 크기를 변수로 설정
        val height = park.size
        val width = park[0].length

        // 시작 위치(S)를 찾음
        var currentPos = Pair(0, 0)
        for (i in park.indices) {
            if ('S' in park[i]) {
                currentPos = Pair(i, park[i].indexOf('S'))
                break
            }
        }

        // 방향별 이동 좌표 변화를 저장하는 맵
        val directionMap = mapOf(
            "N" to Pair(-1, 0), // 북쪽
            "S" to Pair(1, 0),  // 남쪽
            "W" to Pair(0, -1), // 서쪽
            "E" to Pair(0, 1)   // 동쪽
        )

        // 명령에 따라 이동을 처리
        for (route in routes) {
            val (direction, steps) = route.split(" ")
            val move = directionMap[direction]!!
            val stepCount = steps.toInt()

            var newPos = currentPos
            var isBlocked = false

            // 주어진 방향으로 한 칸씩 이동하면서 장애물이나 공원 밖인지 확인
            for (step in 1..stepCount) {
                val nextPos = Pair(newPos.first + move.first, newPos.second + move.second)
                
                // 공원 밖으로 나가는 경우 처리
                if (nextPos.first !in 0 until height || nextPos.second !in 0 until width || park[nextPos.first][nextPos.second] == 'X') {
                    isBlocked = true
                    break
                }
                newPos = nextPos
            }

            // 이동이 가능하면 위치를 업데이트
            if (!isBlocked) {
                currentPos = newPos
            }
        }

        // 최종 위치 반환
        return intArrayOf(currentPos.first, currentPos.second)
    }
}
