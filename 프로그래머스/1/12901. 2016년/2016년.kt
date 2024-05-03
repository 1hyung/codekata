class Solution {
    fun solution(a: Int, b: Int): String {
        val dayOfWeek = listOf("THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED")
        val year2016 = listOf(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
        val totalDay = (0 until a - 1).map { year2016[it] }.sum() + b

        return dayOfWeek[totalDay % 7]
    }
}