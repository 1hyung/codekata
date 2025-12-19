// 카드 뭉치
class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        var idx1 = 0
        var idx2 = 0

        for (word in goal) {
            when {
                idx1 < cards1.size && cards1[idx1] == word -> idx1++
                idx2 < cards2.size && cards2[idx2] == word -> idx2++
                else -> return "No" // 둘 다 안 맞으면 실패
            }
        }

        return "Yes"
    }
}