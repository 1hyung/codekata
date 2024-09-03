import java.util.PriorityQueue

class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        val hallOfFame = PriorityQueue<Int>() // 오름차순으로 정렬된 우선순위 큐
        val result = mutableListOf<Int>()

        for (s in score) {
            hallOfFame.add(s)
            if (hallOfFame.size > k) {
                hallOfFame.poll() // 가장 작은 값을 제거하여 크기를 유지
            }
            result.add(hallOfFame.peek()) // 현재 명예의 전당에서 가장 작은 값을 저장
        }

        return result.toIntArray()
    }
}
