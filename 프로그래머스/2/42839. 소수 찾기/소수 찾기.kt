import kotlin.math.sqrt

class Solution {
    fun solution(numbers: String): Int {
        val numSet = mutableSetOf<Int>()
        
        // 1. 모든 조합의 수를 생성
        generatePermutations(numbers, "", numSet)
        
        // 2. 소수의 개수 세기
        return numSet.count { isPrime(it) }
    }
    
    // 모든 숫자 조합을 구하는 함수
    private fun generatePermutations(numbers: String, current: String, numSet: MutableSet<Int>) {
        if (current.isNotEmpty()) {
            numSet.add(current.toInt())  // 현재 숫자를 세트에 추가
        }
        
        for (i in numbers.indices) {
            generatePermutations(
                numbers.removeRange(i, i + 1), 
                current + numbers[i], 
                numSet
            )
        }
    }
    
    // 소수 판별 함수
    private fun isPrime(num: Int): Boolean {
        if (num < 2) return false
        for (i in 2..sqrt(num.toDouble()).toInt()) {
            if (num % i == 0) return false
        }
        return true
    }
}