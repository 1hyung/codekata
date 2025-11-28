// 콜라문제
class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        var empty = n // 현재 보유 중인 빈 병
        var answer = 0 // 받은 콜라 수

        while (empty >= a) {
            val exchange = (empty / a) * b // 받을 콜라 수
            answer += exchange // 누적
            empty = (empty % a) + exchange // 남은 병 + 새로 받은 병
        }

        return answer
    }
}