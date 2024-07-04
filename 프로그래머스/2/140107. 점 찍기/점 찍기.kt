class Solution {
    fun solution(k: Int, d: Int): Long {
        var answer = 0L
        val kLong = k.toLong()
        val dLong = d.toLong()
        val dSquared = dLong * dLong
        
        for (a in 0..dLong step kLong) {
            val bb = dSquared - a * a  
            val b = Math.sqrt(bb.toDouble()).toLong() / kLong + 1  
            answer += b
        }
        
        return answer
    }
}
