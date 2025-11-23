// x만큼 간격이 있는 n개의 숫자
class Solution {
    fun solution(x: Int, n: Int): LongArray {
        val step = x.toLong()
        return LongArray(n) { i -> step * (i + 1).toLong() }
    }
}