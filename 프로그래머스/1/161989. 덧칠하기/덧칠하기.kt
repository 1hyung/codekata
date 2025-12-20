// 덧칠하기
class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var count = 0
        var currentPos = 0  // 현재 롤러가 칠한 마지막 구역

        for (s in section) {
            if (s > currentPos) {
                // 현재 롤러가 칠할 수 없는 구역이 나오면 롤러로 그 구역부터 m만큼 칠함
                currentPos = s + m - 1  // 롤러의 끝 구역 계산
                count++  // 페인트칠 횟수 증가
            }
        }

        return count
    }
}
