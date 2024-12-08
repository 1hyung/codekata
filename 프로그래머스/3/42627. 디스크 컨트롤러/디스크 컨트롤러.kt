import java.util.PriorityQueue

class Solution {
    fun solution(jobs: Array<IntArray>): Int {
        // 요청 시점 기준으로 오름차순 정렬
        jobs.sortBy { it[0] }

        val pq = PriorityQueue<IntArray> { a, b -> a[1] - b[1] } // 소요 시간 기준 최소 힙
        var currentTime = 0
        var totalResponseTime = 0
        var jobIndex = 0

        while (jobIndex < jobs.size || pq.isNotEmpty()) {
            // 현재 시간까지 도달한 모든 작업 대기 큐에 추가
            while (jobIndex < jobs.size && jobs[jobIndex][0] <= currentTime) {
                pq.offer(jobs[jobIndex])
                jobIndex++
            }

            if (pq.isNotEmpty()) {
                // 대기 큐에서 소요 시간이 가장 짧은 작업 처리
                val job = pq.poll()
                currentTime += job[1] // 현재 시간 갱신
                totalResponseTime += currentTime - job[0] // 반환 시간 계산
            } else {
                // 대기 큐가 비어 있으면 다음 작업 시간으로 건너뜀
                currentTime = jobs[jobIndex][0]
            }
        }

        return totalResponseTime / jobs.size
    }
}