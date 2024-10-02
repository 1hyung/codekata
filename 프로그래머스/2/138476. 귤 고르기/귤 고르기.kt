class Solution {
    fun solution(k: Int, tangerine: IntArray): Int {
        // 1. 각 크기별 귤의 개수를 카운트합니다.
        val countMap = mutableMapOf<Int, Int>()
        for (size in tangerine) {
            countMap[size] = countMap.getOrDefault(size, 0) + 1
        }

        // 2. 개수를 내림차순으로 정렬합니다.
        val sortedCounts = countMap.values.sortedDescending()

        // 3. 최소한의 종류로 k개 이상의 귤을 담기
        var total = 0
        var kinds = 0

        for (count in sortedCounts) {
            total += count
            kinds++
            if (total >= k) break
        }

        return kinds
    }
}
