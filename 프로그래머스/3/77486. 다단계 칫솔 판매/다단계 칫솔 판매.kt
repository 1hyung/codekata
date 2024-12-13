class Solution {
    fun solution(
        enroll: Array<String>,
        referral: Array<String>,
        seller: Array<String>,
        amount: IntArray
    ): IntArray {
        // 이름을 인덱스에 매핑
        val nameToIndex = enroll.withIndex().associate { it.value to it.index }

        // 이익을 저장할 배열
        val profits = IntArray(enroll.size)

        // 이익 분배 함수
        fun distributeProfit(person: String, profit: Int) {
            // 분배할 사람이 없거나, 분배 금액이 0이면 종료
            if (person == "-" || profit == 0) return

            val index = nameToIndex[person]!!
            val referralProfit = profit / 10
            profits[index] += profit - referralProfit

            // 추천인에게 분배
            distributeProfit(referral[index], referralProfit)
        }

        // 판매 데이터를 기반으로 이익 계산
        for (i in seller.indices) {
            val sellerName = seller[i]
            val totalProfit = amount[i] * 100
            distributeProfit(sellerName, totalProfit)
        }

        return profits
    }
}