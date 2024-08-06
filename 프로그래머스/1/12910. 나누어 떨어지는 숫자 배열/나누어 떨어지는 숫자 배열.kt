class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        // divisor로 나누어 떨어지는 원소들을 필터링합니다.
        val result = arr.filter { it % divisor == 0 }.sorted()
        
        // 필터링된 원소가 없다면 -1을 담은 배열을 반환합니다.
        return if (result.isEmpty()) {
            intArrayOf(-1)
        } else {
            result.toIntArray()
        }
    }
}
