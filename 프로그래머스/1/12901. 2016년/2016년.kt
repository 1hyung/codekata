// 2016년
class Solution {
    fun solution(a: Int, b: Int): String {
        val days = arrayOf("FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU") // 2016년 1월 1일 기준 요일 배열
        val month = arrayOf(0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31) // 2016년은 윤년 → 2월은 29일

        val totalDays = (1 until a).sumOf { month[it] } + b - 1 // 1월 1일 포함 X, b-1일 더함
        return days[totalDays % 7] // 요일 인덱스로 변환
    }
}