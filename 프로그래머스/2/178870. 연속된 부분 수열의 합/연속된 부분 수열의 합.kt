class Solution {
    fun solution(sequence: IntArray, k: Int): IntArray {
        var start = 0
        var end = 0
        var sum = sequence[0]
        var minLength = Int.MAX_VALUE
        var result = intArrayOf(-1, -1)
        
        while (end < sequence.size) {
            // 조건을 만족하는 경우
            if (sum == k) {
                val length = end - start + 1
                // 최소 길이 업데이트 및 결과 저장
                if (length < minLength || (length == minLength && start < result[0])) {
                    minLength = length
                    result = intArrayOf(start, end)
                }
                // start를 증가시켜 부분 합을 줄이기
                sum -= sequence[start++]
            }
            // 현재 합이 k보다 작고 end를 확장할 수 있는 경우
            else if (sum < k) {
                end++
                if (end < sequence.size) sum += sequence[end]
            }
            // 현재 합이 k보다 큰 경우
            else {
                sum -= sequence[start++]
            }
        }
        
        return result
    }
}