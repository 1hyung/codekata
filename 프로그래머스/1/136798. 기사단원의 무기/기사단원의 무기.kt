// 기사단원의 무기 
class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int {
        var totalWeight = 0

        for (i in 1..number) {
            val divisorCount = getDivisorCount(i)
            if (divisorCount > limit) {
                totalWeight += power
            } else {
                totalWeight += divisorCount
            }
        }

        return totalWeight
    }

    // 약수 개수를 구하는 함수
    private fun getDivisorCount(n: Int): Int {
        var count = 0
        for (i in 1..Math.sqrt(n.toDouble()).toInt()) {
            if (n % i == 0) {
                count++  // i가 약수일 때
                if (i != n / i) {
                    count++  // n / i도 약수일 때
                }
            }
        }
        return count
    }
}
