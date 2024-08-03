class Solution {
    fun solution(a: Int, b: Int): Long {
        // a와 b 중 작은 값과 큰 값을 결정합니다.
        val start = minOf(a, b)
        val end = maxOf(a, b)
        
        // 작은 값부터 큰 값까지의 합을 계산합니다.
        var sum: Long = 0
        for (i in start..end) {
            sum += i
        }
        
        return sum
    }
}
