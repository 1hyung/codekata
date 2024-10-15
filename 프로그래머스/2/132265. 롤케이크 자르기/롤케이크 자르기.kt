class Solution {
    fun solution(topping: IntArray): Int {
        val leftSet = mutableSetOf<Int>()           // 왼쪽 토핑 종류를 저장하는 집합
        val rightMap = mutableMapOf<Int, Int>()     // 오른쪽 토핑을 종류별로 카운트하는 맵

        // 처음에 오른쪽 맵을 모두 채운다
        for (top in topping) {
            rightMap[top] = rightMap.getOrDefault(top, 0) + 1
        }

        var count = 0

        // 왼쪽부터 순차적으로 탐색하며 자를 위치를 찾는다
        for (i in topping.indices) {
            // 왼쪽에 토핑 추가
            leftSet.add(topping[i])

            // 오른쪽에서 해당 토핑을 하나 제거
            rightMap[topping[i]] = rightMap[topping[i]]!! - 1
            if (rightMap[topping[i]] == 0) {
                rightMap.remove(topping[i])
            }

            // 왼쪽과 오른쪽의 토핑 종류 수가 같으면 카운트 증가
            if (leftSet.size == rightMap.size) {
                count++
            }
        }

        return count
    }
}
