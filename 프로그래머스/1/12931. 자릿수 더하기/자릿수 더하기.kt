class Solution {
    fun solution(n: Int): Int {
        // n을 문자열로 변환하고 각 자릿수를 정수로 변환하여 리스트로 만듭니다.
        val digits = n.toString().map {
            val digit = it.toInt() - '0'.toInt()
            println("Digit: $digit") // 중간 값을 출력
            digit
        }

        // 리스트의 숫자들을 모두 더합니다.
        val sum = digits.sum()
        println("Sum: $sum") // 합계를 출력
        
        // 합계를 반환합니다.
        return sum
    }
}
