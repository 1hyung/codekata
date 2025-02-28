class Solution {
    // 정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 단일 표현식 함수 
    fun solution(num: Int): String = if (num % 2 == 0) "Even" else "Odd"
}