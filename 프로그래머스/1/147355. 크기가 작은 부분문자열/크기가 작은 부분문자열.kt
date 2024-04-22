class Solution {
    fun solution(t: String, p: String): Int = (0..t.length - p.length).map {
        t.substring(it until it + p.length).toLong()
    }.count {
        it <= p.toLong()
    }
    
}