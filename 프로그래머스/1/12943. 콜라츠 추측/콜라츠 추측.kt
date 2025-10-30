// 콜라츠 추측
class Solution {
    fun solution(num: Int): Int {
        var current = num.toLong() // 연산 중 overflow 방지를 위해 Long으로 변환

        repeat(500) { count -> // 최대 500회 반복
            if (current == 1L) return count // 수가 1이면 현재 횟수 반환

            current = if (current % 2 == 0L) {
                current / 2 // 짝수일 때
            } else {
                current * 3 + 1 // 홀수일 때
            }
        }

        return -1 // 500번 반복해도 1이 되지 않으면 -1 반환
    }
}