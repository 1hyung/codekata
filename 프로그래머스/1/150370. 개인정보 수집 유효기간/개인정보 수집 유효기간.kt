class Solution {
    fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
        val answer = mutableListOf<Int>()
        val todayTotalDays = calculateTotalDays(today)
        val termMap = terms.associate {
            val (type, duration) = it.split(" ")
            type to duration.toInt()
        }

        privacies.forEachIndexed { index, privacy ->
            val (date, type) = privacy.split(" ")
            val privacyTotalDays = calculateTotalDays(date)
            val termDuration = termMap[type] ?: 0
            val expiryDays = termDuration * 28

            if (todayTotalDays >= (privacyTotalDays + expiryDays)) {
                answer.add(index + 1)
            }
        }

        return answer.toIntArray()
    }

    private fun calculateTotalDays(date: String): Int {
        val (year, month, day) = date.split(".").map { it.toInt() }
        return (year * 12 * 28) + ((month - 1) * 28) + day
    }
}