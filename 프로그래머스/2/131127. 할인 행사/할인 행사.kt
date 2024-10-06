class Solution {
    fun solution(want: Array<String>, number: IntArray, discount: Array<String>): Int {
        // 정현이가 원하는 제품과 수량을 맵으로 저장합니다.
        val wantMap = mutableMapOf<String, Int>()
        for (i in want.indices) {
            wantMap[want[i]] = number[i]
        }

        var count = 0 // 원하는 조건을 만족하는 구간의 개수를 셉니다.
        val windowSize = 10 // 슬라이딩 윈도우 크기 (항상 10일)

        // 슬라이딩 윈도우를 이용하여 모든 10일 구간을 검사합니다.
        for (i in 0..discount.size - windowSize) {
            val currentMap = mutableMapOf<String, Int>()
            
            // 현재 구간에 있는 제품을 카운트합니다.
            for (j in i until i + windowSize) {
                currentMap[discount[j]] = currentMap.getOrDefault(discount[j], 0) + 1
            }

            // 현재 구간의 제품 수량이 정현이가 원하는 제품 수량과 일치하는지 검사합니다.
            if (matches(currentMap, wantMap)) {
                count++
            }
        }

        return count
    }

    // 두 맵을 비교하여 현재 구간의 제품 수량이 정현이가 원하는 수량과 일치하는지 확인하는 함수
    private fun matches(currentMap: Map<String, Int>, wantMap: Map<String, Int>): Boolean {
        for ((key, value) in wantMap) {
            if (currentMap.getOrDefault(key, 0) < value) {
                return false
            }
        }
        return true
    }
}
