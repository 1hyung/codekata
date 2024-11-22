class Solution {
    private val discountRates = arrayOf(10, 20, 30, 40) // 가능한 할인율

    fun solution(users: Array<IntArray>, emoticons: IntArray): IntArray {
        var maxSubscribers = 0
        var maxSales = 0

        // 모든 할인율 조합 생성
        fun dfs(discounts: MutableList<Int>, index: Int) {
            if (index == emoticons.size) {
                calculate(users, emoticons, discounts).let { (subscribers, sales) ->
                    if (subscribers > maxSubscribers || (subscribers == maxSubscribers && sales > maxSales)) {
                        maxSubscribers = subscribers
                        maxSales = sales
                    }
                }
                return
            }

            // 각 이모티콘에 대해 할인율을 순회
            for (rate in discountRates) {
                discounts.add(rate)
                dfs(discounts, index + 1)
                discounts.removeAt(discounts.lastIndex)
            }
        }

        dfs(mutableListOf(), 0)
        return intArrayOf(maxSubscribers, maxSales)
    }

    // 주어진 할인율 조합으로 가입자 수와 판매액 계산
    private fun calculate(users: Array<IntArray>, emoticons: IntArray, discounts: List<Int>): Pair<Int, Int> {
        var subscribers = 0
        var totalSales = 0

        for (user in users) {
            val (requiredRate, minPrice) = user
            var userTotal = 0

            for (i in emoticons.indices) {
                if (discounts[i] >= requiredRate) {
                    userTotal += emoticons[i] * (100 - discounts[i]) / 100
                }
            }

            // 서비스 가입 여부 확인
            if (userTotal >= minPrice) {
                subscribers++
            } else {
                totalSales += userTotal
            }
        }

        return subscribers to totalSales
    }
}