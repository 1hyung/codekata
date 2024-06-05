class Solution {
    fun solution(n: Int, left: Long, right: Long): IntArray {
        val answer = IntArray((right - left).toInt() + 1)
        
        for (i in answer.indices) {
            val idx = left + i
            val r = (idx / n).toInt()
            val c = (idx % n).toInt()
            answer[i] = maxOf(r, c) + 1
        }
        
        return answer
    }
}
