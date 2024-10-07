class Solution {
    fun solution(clothes: Array<Array<String>>): Int {
        // 의상의 종류별로 개수를 저장할 맵
        val clothMap = mutableMapOf<String, Int>()

        // 의상을 종류별로 개수 세기
        for (cloth in clothes) {
            val kind = cloth[1]
            clothMap[kind] = clothMap.getOrDefault(kind, 0) + 1
        }

        // 경우의 수 계산
        var combinations = 1
        for ((_, count) in clothMap) {
            combinations *= (count + 1)
        }

        // 모든 의상을 입지 않은 경우를 제외하기 위해 1을 뺍니다.
        return combinations - 1
    }
}
