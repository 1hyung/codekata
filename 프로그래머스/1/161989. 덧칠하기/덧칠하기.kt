class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var curM = section[0]
        var answer = 1

        for (i in 0 until section.size) {
            if (section[i] <= curM + m - 1) continue
            else {

                curM = section[i]

                answer++
            }
        }
        return answer
    }
}