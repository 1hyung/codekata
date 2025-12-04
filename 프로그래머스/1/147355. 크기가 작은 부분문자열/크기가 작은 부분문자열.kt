// 크기가 작은 부분문자열
class Solution {
    fun solution(t: String, p: String): Int {
        val pLength = p.length
        val pValue = p.toLong()
        var count = 0

        for (i in 0..t.length - pLength) {
            val sub = t.substring(i, i + pLength).toLong()
            if (sub <= pValue) count++
        }

        return count
    }
}