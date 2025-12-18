// 카펫
class Solution {
    fun solution(brown: Int, yellow: Int): IntArray {
        val total = brown + yellow  // 전체 격자의 수

        // 가로와 세로의 값을 찾기 위한 반복문 (total의 약수 탐색)
        for (height in 1..total) {
            if (total % height == 0) {
                val width = total / height  // 가로를 구함

                // 노란색 격자의 수가 맞는지 확인
                if ((width - 2) * (height - 2) == yellow) {
                    return intArrayOf(width, height)  // 가로, 세로 반환
                }
            }
        }

        return intArrayOf()  // 만약 조건을 만족하지 않으면 빈 배열 반환
    }
}
