// 하샤드 수

class Solution {
    fun solution(x: Int): Boolean {
        var num = x
        var sum = 0

        while (num > 0) { // 모든 자릿수를 합산
            sum += num % 10 // 마지막 자릿수를 더함
            num /= 10 // 마지막 자릿수를 제거
        }

        return x % sum == 0 // 나누어 떨어지면 true 반환
    }
}