class Solution {
    fun solution(wallpaper: Array<String>): IntArray {
        // 최소 드래그 시작점과 끝점을 추적하기 위한 변수들 초기화
        var minX = Int.MAX_VALUE // 최소 x 좌표 (세로)
        var minY = Int.MAX_VALUE // 최소 y 좌표 (가로)
        var maxX = Int.MIN_VALUE // 최대 x 좌표 (세로)
        var maxY = Int.MIN_VALUE // 최대 y 좌표 (가로)

        // 바탕화면을 순회하면서 파일("#")의 위치를 찾음
        for (i in wallpaper.indices) { // i는 세로 인덱스
            for (j in wallpaper[i].indices) { // j는 가로 인덱스
                if (wallpaper[i][j] == '#') {
                    // 파일이 있는 위치에서 최소, 최대 좌표 갱신
                    minX = minOf(minX, i)
                    minY = minOf(minY, j)
                    maxX = maxOf(maxX, i + 1) // 끝점이므로 1을 더함
                    maxY = maxOf(maxY, j + 1) // 끝점이므로 1을 더함
                }
            }
        }

        // 계산된 좌표 반환: 드래그 시작점 (minX, minY), 끝점 (maxX, maxY)
        return intArrayOf(minX, minY, maxX, maxY)
    }
}
