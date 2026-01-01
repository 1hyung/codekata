// 주차 요금 계산
import kotlin.math.ceil

class Solution {
    fun solution(fees: IntArray, records: Array<String>): IntArray {
        val parkingTimes = mutableMapOf<String, Int>() // 차량별 누적 주차 시간을 저장할 맵
        val inTimeMap = mutableMapOf<String, Int>() // 차량별 입차 시간을 저장할 맵

        for (record in records) {
            val (time, carNumber, status) = record.split(" ")
            val minutes = timeToMinutes(time) // 시각을 분 단위로 변환

            if (status == "IN") {
                inTimeMap[carNumber] = minutes // 입차 시간 기록
            } else {
                val inTime = inTimeMap.remove(carNumber)!!
                val parkedTime = minutes - inTime // 출차 시간 - 입차 시간 = 주차 시간
                parkingTimes[carNumber] = parkingTimes.getOrDefault(carNumber, 0) + parkedTime
            }
        }

        // 출차 기록이 없는 차량 23:59에 출차 처리
        val endOfDay = timeToMinutes("23:59")
        for ((carNumber, inTime) in inTimeMap) {
            val parkedTime = endOfDay - inTime
            parkingTimes[carNumber] = parkingTimes.getOrDefault(carNumber, 0) + parkedTime
        }

        // 차량 번호 순서대로 요금 계산
        return parkingTimes.toSortedMap().map { (carNumber, totalMinutes) ->
            calculateFee(fees, totalMinutes)
        }.toIntArray()
    }

    // 시간을 분 단위로 변환하는 함수 (HH:MM -> 분)
    private fun timeToMinutes(time: String): Int {
        val (hours, minutes) = time.split(":").map { it.toInt() }
        return hours * 60 + minutes
    }

    // 요금을 계산하는 함수
    private fun calculateFee(fees: IntArray, time: Int): Int {
        val (basicTime, basicFee, unitTime, unitFee) = fees
        if (time <= basicTime) {
            return basicFee
        }
        val extraTime = time - basicTime
        val extraFee = ceil(extraTime.toDouble() / unitTime).toInt() * unitFee
        return basicFee + extraFee
    }
}
