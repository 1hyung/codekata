class Solution {
    fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
        val todayDate = parseDate(today) // 오늘 날짜를 List<Int>로 변환
        val termMap = mutableMapOf<String, Int>() // 약관과 유효기간 매핑

        // 약관 정보를 맵에 저장
        terms.forEach { 
            val split = it.split(" ")
            termMap[split[0]] = split[1].toInt()
        }

        val result = mutableListOf<Int>() // 파기해야 할 개인정보 번호 저장

        // 개인정보별로 유효기간 확인
        privacies.forEachIndexed { index, privacy ->
            val split = privacy.split(" ") // 개인정보 정보를 날짜와 약관으로 나눔
            val privacyDate = parseDate(split[0]) // 수집 날짜를 List<Int>로 변환
            val term = split[1] // 약관 종류

            // 수집 날짜에 유효기간을 더하여 파기일 계산
            val expirationDate = addMonths(privacyDate, termMap[term]!!)

            // expirationDate가 todayDate보다 이전인지 비교
            if (isBeforeOrEqual(expirationDate, todayDate)) {
                result.add(index + 1)
            }
        }

        return result.toIntArray() // 결과를 배열로 반환
    }

    // 문자열 날짜를 "YYYY.MM.DD" 형식으로 파싱하여 List<Int> 형태로 반환
    private fun parseDate(date: String): List<Int> {
        return date.split(".").map { it.toInt() }
    }

    // 날짜에 달을 추가하는 함수 (28일 기준으로 한 달 계산)
    private fun addMonths(date: List<Int>, months: Int): List<Int> {
        var year = date[0]
        var month = date[1]
        var day = date[2]

        month += months

        // 달이 12를 초과할 경우 연도로 계산
        while (month > 12) {
            month -= 12
            year++
        }

        return listOf(year, month, day)
    }

    // 두 날짜를 비교하는 함수 (year, month, day 순으로 비교)
    private fun isBeforeOrEqual(date1: List<Int>, date2: List<Int>): Boolean {
        if (date1[0] < date2[0]) return true
        if (date1[0] == date2[0] && date1[1] < date2[1]) return true
        if (date1[0] == date2[0] && date1[1] == date2[1] && date1[2] <= date2[2]) return true
        return false
    }
}
