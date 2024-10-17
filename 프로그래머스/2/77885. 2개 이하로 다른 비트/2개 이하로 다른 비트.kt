class Solution {
    fun solution(numbers: LongArray): LongArray {
        return numbers.map { f(it) }.toLongArray()
    }
    
    private fun f(x: Long): Long {
        if (x % 2 == 0L) {
            // 짝수일 경우, x + 1이 바로 답
            return x + 1
        } else {
            // 홀수일 경우
            // 마지막 연속된 1 중 첫 번째 0을 1로 바꾸고, 그 다음 비트를 0으로 바꾼다
            val bit = x or (x + 1)
            return bit - ((bit - x) / 2)
        }
    }
}
