class Solution {
    fun solution(plans: Array<Array<String>>): List<String> {
        // 1. 입력 정리: 시간을 분 단위로 변환하고 시작 시간을 기준으로 정렬
        val sortedPlans = plans.map { 
            val (name, start, playtime) = it
            val timeParts = start.split(":").map { it.toInt() }
            Triple(name, timeParts[0] * 60 + timeParts[1], playtime.toInt())
        }.sortedBy { it.second }

        val completedTasks = mutableListOf<String>() // 완료된 작업
        val pausedTasks = mutableListOf<Pair<String, Int>>() // 멈춘 작업 (이름, 남은 시간)
        var currentTime = 0

        // 2. 작업 처리
        for (i in sortedPlans.indices) {
            val (name, startTime, playtime) = sortedPlans[i]

            // 처리 중인 작업이 있는 경우
            while (pausedTasks.isNotEmpty() && currentTime < startTime) {
                val (pausedName, remainingTime) = pausedTasks.removeAt(pausedTasks.size - 1)
                val availableTime = startTime - currentTime

                if (remainingTime <= availableTime) {
                    // 멈춘 작업 완료
                    completedTasks.add(pausedName)
                    currentTime += remainingTime
                } else {
                    // 작업이 남으면 다시 스택에 저장
                    pausedTasks.add(Pair(pausedName, remainingTime - availableTime))
                    currentTime = startTime
                    break
                }
            }

            // 새 작업 시작
            currentTime = startTime
            if (i == sortedPlans.lastIndex || currentTime + playtime <= sortedPlans[i + 1].second) {
                // 현재 작업을 끝낼 수 있는 경우
                completedTasks.add(name)
                currentTime += playtime
            } else {
                // 작업을 중단하고 스택에 저장
                pausedTasks.add(Pair(name, playtime - (sortedPlans[i + 1].second - currentTime)))
                currentTime = sortedPlans[i + 1].second
            }
        }

        // 3. 남은 작업 처리
        while (pausedTasks.isNotEmpty()) {
            completedTasks.add(pausedTasks.removeAt(pausedTasks.size - 1).first)
        }

        return completedTasks
    }
}