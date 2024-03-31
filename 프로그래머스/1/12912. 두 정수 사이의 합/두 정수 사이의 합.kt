class Solution {
    fun solution(a: Int, b: Int): Long {
        var sum: Long = 0
        
        if (a <= b) {
            for (i in a..b) {
                sum += i
            }
        }
        else {
            for (i in b..a) {
                sum += i
            }
        }
        return sum.toLong()
    }
}