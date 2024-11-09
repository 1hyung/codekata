class Solution {
    fun solution(n: Int): Array<IntArray> {
        val result = mutableListOf<IntArray>()
        hanoi(n, 1, 3, 2, result)
        return result.toTypedArray()
    }

    // 재귀 함수: n개의 원판을 from 기둥에서 to 기둥으로 옮김
    private fun hanoi(n: Int, from: Int, to: Int, aux: Int, result: MutableList<IntArray>) {
        if (n == 1) {
            // 원판이 1개일 때는 바로 from에서 to로 옮기기
            result.add(intArrayOf(from, to))
        } else {
            // 1. n-1개의 원판을 from에서 aux로 옮기기
            hanoi(n - 1, from, aux, to, result)
            // 2. 가장 큰 원판을 from에서 to로 옮기기
            result.add(intArrayOf(from, to))
            // 3. n-1개의 원판을 aux에서 to로 옮기기
            hanoi(n - 1, aux, to, from, result)
        }
    }
}