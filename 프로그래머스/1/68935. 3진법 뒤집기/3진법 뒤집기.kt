// 3진법 뒤집기

class Solution {
    fun solution(n: Int): Int =
        n.toString(3)        // 1.3진법 문자열로 변환
            .reversed()      // 2.문자열을 뒤집음
            .toInt(3)        // 3.다시 10진법 정수로 변환
}