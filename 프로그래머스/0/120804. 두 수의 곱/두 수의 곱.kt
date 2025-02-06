// 두 정수의 곱
class Solution {
    fun solution(num1: Int, num2: Int): Int {
        // 입력받은 두 수를 multiply 함수를 사용해 곱한 값을 반환
        return multiply(num1, num2)
    }

    // 두 수의 곱을 반환하는 함수 (Solution 클래스 내부에서만 사용 가능)
    private fun multiply(a: Int, b: Int): Int {
        return a * b 
    }
}