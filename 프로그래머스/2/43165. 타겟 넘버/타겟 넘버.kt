class Solution {
    fun solution(numbers: IntArray, target: Int): Int {
        return dfs(numbers, target, 0, 0)
    }

    private fun dfs(numbers: IntArray, target: Int, index: Int, sum: Int): Int {
        // 모든 숫자를 사용한 경우
        if (index == numbers.size) {
            // 계산된 값이 타겟 넘버와 같으면 1을 반환
            return if (sum == target) 1 else 0
        }

        // 현재 숫자를 더한 경우와 뺀 경우를 각각 재귀 호출
        val add = dfs(numbers, target, index + 1, sum + numbers[index])
        val subtract = dfs(numbers, target, index + 1, sum - numbers[index])

        // 두 가지 경우의 수를 합산하여 반환
        return add + subtract
    }
}