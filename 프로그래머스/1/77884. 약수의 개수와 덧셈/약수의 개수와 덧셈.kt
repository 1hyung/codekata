class Solution {
    fun solution(left: Int, right: Int): Int {
        var result = 0

        for (num in left..right) {
            val divisorCount = countDivisors(num)
            if (divisorCount % 2 == 0) {
                result += num
            } else {
                result -= num
            }
        }

        return result
    }

    // 주어진 숫자의 약수 개수를 구하는 함수
    private fun countDivisors(num: Int): Int {
        var count = 0
        for (i in 1..num) {
            if (num % i == 0) {
                count++
            }
        }
        return count
    }
}
