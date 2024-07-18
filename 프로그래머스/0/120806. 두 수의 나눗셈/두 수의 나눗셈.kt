class Solution {
    //num1/num2 후에 1000을 곱하면 소수점이 남아있을 수 있지만 num1에 1000을 먼저 곱하고 나눠주면 정수부분만 하기 더 쉽다.
    fun solution(num1: Int, num2: Int): Int = num1*1000 / num2
}