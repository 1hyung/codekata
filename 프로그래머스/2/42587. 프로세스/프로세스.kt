import java.util.*

class Solution {
    fun solution(priorities: IntArray, location: Int): Int {
        // 프로세스의 위치와 우선순위를 함께 저장하는 큐
        val queue: Queue<Pair<Int, Int>> = LinkedList()

        // 큐에 각 프로세스의 (인덱스, 우선순위)를 넣습니다.
        for (i in priorities.indices) {
            queue.add(Pair(i, priorities[i]))
        }

        // 처리 순서
        var executionOrder = 0

        // 우선순위가 높은 것부터 처리하는 로직
        while (queue.isNotEmpty()) {
            val current = queue.poll() // 큐에서 프로세스 꺼냄
            // 남아있는 프로세스 중 더 높은 우선순위가 있는지 확인
            if (queue.any { it.second > current.second }) {
                queue.add(current) // 더 높은 우선순위가 있으면 다시 큐에 넣음
            } else {
                // 프로세스 실행
                executionOrder++
                if (current.first == location) {
                    // 만약 실행된 프로세스가 목표 프로세스라면 순서를 반환
                    return executionOrder
                }
            }
        }

        return -1 // 이론상 도달할 수 없는 코드
    }
}
