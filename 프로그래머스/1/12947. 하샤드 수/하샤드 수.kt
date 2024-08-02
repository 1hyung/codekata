class Solution {
    fun solution(x: Int): Boolean {
        // x를 문자열로 변환한 뒤, 각 자릿수를 정수로 변환하여 합을 구합니다.
        val sumOfDigits = x.toString().map { it.toString().toInt() }.sum()
        
        // x가 자릿수 합으로 나누어 떨어지는지 확인합니다.
        return x % sumOfDigits == 0
    }
}
