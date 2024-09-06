class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        var index1 = 0  // cards1의 포인터
        var index2 = 0  // cards2의 포인터

        for (word in goal) {
            when {
                index1 < cards1.size && cards1[index1] == word -> {
                    index1++  // cards1에서 카드를 사용
                }
                index2 < cards2.size && cards2[index2] == word -> {
                    index2++  // cards2에서 카드를 사용
                }
                else -> {
                    return "No"  // goal의 단어가 cards1, cards2와 일치하지 않으면 불가능
                }
            }
        }

        return "Yes"  // 모든 단어를 순서대로 만들 수 있으면 "Yes"
    }
}
