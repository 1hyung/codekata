import java.util.PriorityQueue

class Solution {
    fun solution(n: Int, k: Int, enemy: IntArray): Int {
        val pq = PriorityQueue<Int>() // 최소 힙
        var soldiers = n

        for (i in enemy.indices) {
            pq.add(enemy[i]) // 현재 라운드 적의 수 추가

            // 무적권보다 더 많은 적 라운드를 진행한 경우
            if (pq.size > k) {
                soldiers -= pq.poll() // 가장 작은 적의 수를 병사로 처리
                if (soldiers < 0) return i // 병사가 부족하면 종료
            }
        }
        return enemy.size // 모든 라운드를 방어할 수 있으면 전체 길이 반환
    }
}