class Solution {
    fun solution(s: String): IntArray {
        val answer = intArrayOf(0, 0)
        var str = s
        
        while (str != "1") {
            answer[0]++
            answer[1] += str.count { it == '0' }
            str = str.replace("0", "").length.toString(2)
        }
        return answer
    }
}