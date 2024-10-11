import kotlin.math.sqrt
import kotlin.math.ceil

class Solution {
    fun solution(n: Int, k: Int): Int {
        // 1. 정수를 k진법으로 변환하는 함수 호출
        val kBaseStr = convertToKBase(n, k)

        // 2. 변환된 k진법 수를 '0'을 기준으로 분리하여 소수 후보 추출
        val candidates = kBaseStr.split("0").filter { it.isNotEmpty() }

        // 3. 소수 판별 및 개수 세기
        var primeCount = 0
        for (candidate in candidates) {
            val number = candidate.toLong() // 문자열을 숫자로 변환
            if (isPrime(number)) {
                primeCount++
            }
        }

        return primeCount
    }

    // 정수를 k진법으로 변환하는 함수
    private fun convertToKBase(n: Int, k: Int): String {
        var number = n
        var result = ""
        while (number > 0) {
            val remainder = number % k
            result = remainder.toString() + result
            number /= k
        }
        return result
    }

    // 소수 판별 함수
    private fun isPrime(num: Long): Boolean {
        if (num < 2) return false
        if (num == 2L) return true
        if (num % 2 == 0L) return false
        val sqrtNum = sqrt(num.toDouble()).toLong()
        for (i in 3..sqrtNum step 2) {
            if (num % i == 0L) return false
        }
        return true
    }
}
