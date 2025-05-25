// 두 수의 나눗셈
// num1에 num2로 나눈 값에 1000을 곱한 뒤 정수 부분을 반환
// num1에 1000을 곱한 뒤 num2로 나누면 매개변수가 Int이기 때문에 정수 반환
// Kotlin에서는 정수 연산이므로 소수점 이하가 자동으로 제거
class Solution {
    fun solution(num1: Int, num2: Int) = num1 * 1000 / num2
}