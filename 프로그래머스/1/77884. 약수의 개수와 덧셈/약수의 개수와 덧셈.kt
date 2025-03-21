class Solution {
    fun solution(left: Int, right: Int): Int {
        var answer = 0
        for (num in left..right) {
            // 제곱수인지 판단
            val sqrt = Math.sqrt(num.toDouble()).toInt()
            if (sqrt * sqrt == num) { // 제곱수이면 약수 개수 홀수
                answer -= num 
            } else {
                answer += num // 제곱수가 아니면 약수 개수 짝수
            }
        }
        return answer
    }
}