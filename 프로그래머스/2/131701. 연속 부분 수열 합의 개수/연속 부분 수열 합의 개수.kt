class Solution {
    fun solution(elements: IntArray): Int {
        val n = elements.size
        val extended = elements + elements // 원형 수열을 쉽게 처리하기 위해 두 번 연결
        val sumSet = mutableSetOf<Int>() // 부분 수열의 합을 저장할 집합

        // 모든 길이의 부분 수열에 대해 반복
        for (length in 1..n) {
            // 부분 수열의 시작 인덱스를 0부터 n-1까지 이동하며 합을 계산
            for (start in 0 until n) {
                var sum = 0
                // 시작점부터 length만큼의 부분 수열 합을 계산
                for (i in 0 until length) {
                    sum += extended[start + i]
                }
                sumSet.add(sum) // 집합에 합을 추가 (중복 제거됨)
            }
        }

        return sumSet.size // 중복을 제거한 부분 수열 합의 개수 반환
    }
}
