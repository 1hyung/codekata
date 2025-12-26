// H-Index
class Solution {
    fun solution(citations: IntArray): Int {
        // 1. 논문의 인용 횟수를 내림차순으로 정렬합니다.
        val sortedCitations = citations.sortedDescending()

        // 2. H-Index 계산
        var hIndex = 0
        for (i in sortedCitations.indices) {
            if (sortedCitations[i] >= i + 1) {
                hIndex = i + 1
            } else {
                break
            }
        }

        return hIndex
    }
}