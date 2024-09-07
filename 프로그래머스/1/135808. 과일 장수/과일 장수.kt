class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var totalProfit = 0

        // 사과 점수를 내림차순으로 정렬
        score.sortDescending()

        // m개씩 묶어서 상자 만들기
        for (i in m - 1 until score.size step m) {
            totalProfit += score[i] * m
        }

        return totalProfit
    }
}
