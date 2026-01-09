// 시소 짝꿍
class Solution {
    var answer: Long = 0 // 가능한 짝꿍 수의 최대값을 저장할 변수
    
    fun solution(weights: IntArray): Long {
        weights.sort() // 무게 배열을 오름차순으로 정렬
        calc(weights) // 계산을 수행하는 함수 호출
        return answer // 계산된 짝꿍 수 반환
    }

    // 가능한 짝꿍 수를 계산하는 재귀 함수
    fun calc(list: IntArray, i: Int = 0, count: Long = 0) {
        // 마지막 원소까지 확인한 경우 answer 업데이트
        if (i == list.lastIndex) {
            if (answer < count) answer = count // 최대 짝꿍 수 업데이트
        } else {
            var result = 0 // 현재 i번째 무게에서 생성할 수 있는 짝꿍 수
            val numI = list[i] // i번째 무게

            // i번째 이후의 모든 무게와 짝꿍 조건 확인
            for (j in i + 1..list.lastIndex) {
                val numJ = list[j] // 비교할 j번째 무게
                // 짝꿍이 되는 조건을 만족하는지 확인
                if (numI == numJ || numI * 4 == numJ * 3 || numI * 4 == numJ * 2 || numI * 3 == numJ * 2) result++
            }

            // 재귀 호출을 통해 다음 인덱스 i + 1에 대해 계산 수행
            calc(list, i + 1, count + result)
        }
    }
}