class Solution {
    fun solution(a: Int, b: Int): String {
        // 각 달의 일수 배열 (윤년이므로 2월이 29일임)
        val daysInMonths = intArrayOf(0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
        // 요일 배열 (일요일부터 토요일 순서)
        val daysOfWeek = arrayOf("SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT")
        
        // 1월 1일부터 입력받은 날짜까지의 총 일수 계산
        var totalDays = b
        for (i in 1 until a) {
            totalDays += daysInMonths[i]
        }
        
        // 2016년 1월 1일이 금요일이므로, 총 일수를 계산하여 요일 결정
        return daysOfWeek[(totalDays + 4) % 7]
    }
}
