import kotlin.math.ceil

class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        // 각 기능이 완료될 때까지 남은 일수를 저장할 리스트
        val days = mutableListOf<Int>()

        // 각 기능이 완료될 때까지 남은 일수를 계산
        for (i in progresses.indices) {
            val remainingProgress = 100 - progresses[i] // 남은 작업량
            val requiredDays = ceil(remainingProgress.toDouble() / speeds[i]).toInt() // 완료까지 필요한 일수
            days.add(requiredDays)
        }

        // 배포될 기능 수를 저장할 리스트
        val result = mutableListOf<Int>()
        var deployCount = 1
        var currentMaxDay = days[0] // 첫 번째 기능이 배포될 때까지 걸리는 시간

        // 각 기능을 순차적으로 확인하며 배포 가능 여부 판단
        for (i in 1 until days.size) {
            if (days[i] <= currentMaxDay) {
                // 현재 기능이 이전 기능과 함께 배포될 수 있으면 배포 카운트 증가
                deployCount++
            } else {
                // 현재 기능이 배포될 수 없으면 이전까지 배포 가능한 기능을 기록하고, 새로운 배포 시작
                result.add(deployCount)
                deployCount = 1 // 새로운 배포 시작
                currentMaxDay = days[i] // 현재 기능의 배포 일수를 기준으로 업데이트
            }
        }
        // 마지막 배포 그룹 기록
        result.add(deployCount)

        return result.toIntArray()
    }
}
