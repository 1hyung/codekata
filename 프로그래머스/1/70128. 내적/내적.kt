class Solution {
    fun solution(a: IntArray, b: IntArray): Int {
        return a.indices.sumOf { a[it] * b[it] }
    }
}
