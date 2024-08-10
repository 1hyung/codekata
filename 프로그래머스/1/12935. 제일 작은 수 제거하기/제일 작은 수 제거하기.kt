class Solution {
    fun solution(arr: IntArray): IntArray {
        // 배열이 비어있는 경우 또는 길이가 1인 경우, [-1]을 반환합니다.
        if (arr.size <= 1) {
            return intArrayOf(-1)
        }
        
        // 가장 작은 값을 찾습니다.
        val minValue = arr.minOrNull()
        
        // 가장 작은 값을 제외한 새로운 배열을 만듭니다.
        val result = arr.filter { it != minValue }.toIntArray()
        
        return result
    }
}
