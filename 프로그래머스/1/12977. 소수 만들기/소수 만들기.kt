class Solution {
    fun solution(nums: IntArray): Int {
        var count = 0

        // 3개의 숫자를 선택하여 합을 구하는 부분
        for (i in 0 until nums.size - 2) {
            for (j in i + 1 until nums.size - 1) {
                for (k in j + 1 until nums.size) {
                    val sum = nums[i] + nums[j] + nums[k]
                    // 합이 소수인지 확인
                    if (isPrime(sum)) {
                        count++
                    }
                }
            }
        }

        return count
    }

    // 소수 판별 함수
    private fun isPrime(n: Int): Boolean {
        if (n < 2) return false
        for (i in 2..Math.sqrt(n.toDouble()).toInt()) {
            if (n % i == 0) return false
        }
        return true
    }
}
