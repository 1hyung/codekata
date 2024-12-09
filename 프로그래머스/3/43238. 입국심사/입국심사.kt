class Solution {
    fun solution(n: Int, times: IntArray): Long {
        var left: Long = 1
        var right: Long = n.toLong() * times.maxOrNull()!!
        var answer: Long = right

        while (left <= right) {
            val mid = (left + right) / 2
            val peopleProcessed = times.fold(0L) { acc, time -> acc + mid / time }

            if (peopleProcessed >= n) {
                answer = mid
                right = mid - 1
            } else {
                left = mid + 1
            }
        }

        return answer
    }
}