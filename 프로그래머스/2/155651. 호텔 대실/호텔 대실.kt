import java.util.PriorityQueue

class Solution {
    fun solution(book_time: Array<Array<String>>): Int {
        // 시간을 분 단위로 변환하는 함수
        fun toMinutes(time: String): Int {
            val (hour, minute) = time.split(":").map { it.toInt() }
            return hour * 60 + minute
        }

        // 1. 예약 시간의 시작과 종료를 분 단위로 변환하여 리스트에 저장 (List로 변경)
        val reservations = book_time.map { arrayOf(toMinutes(it[0]), toMinutes(it[1]) + 10) }.toMutableList()
        
        // 2. 예약 시작 시간을 기준으로 정렬
        reservations.sortBy { it[0] }

        // 3. 종료 시각을 저장할 최소 힙 생성
        val endTimes = PriorityQueue<Int>()

        // 4. 필요한 최소 객실 수 계산
        for (reservation in reservations) {
            val start = reservation[0]
            val end = reservation[1]

            // 현재 예약의 시작 시각보다 일찍 종료된 방이 있다면 그 방을 재사용
            if (endTimes.isNotEmpty() && endTimes.peek() <= start) {
                endTimes.poll()
            }

            // 종료 시각을 힙에 추가
            endTimes.add(end)
        }

        // 최종적으로 필요한 객실 수는 힙의 크기
        return endTimes.size
    }
}