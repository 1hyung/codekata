class Solution {
    fun solution(queue1: IntArray, queue2: IntArray): Int {
        val totalQueue = (queue1 + queue2).map { it.toLong() }
        val targetSum = (totalQueue.sum() / 2)

        if (totalQueue.sum() % 2 != 0L) return -1 // 전체 합이 홀수인 경우 -1 반환

        var i = 0
        var j = queue1.size
        var sum1 = queue1.sumOf { it.toLong() }
        var moves = 0
        val maxMoves = queue1.size * 3 // 한 큐의 최대 3배 횟수로 제한

        while (moves <= maxMoves) {
            when {
                sum1 == targetSum -> return moves // 목표 합에 도달했을 때
                sum1 > targetSum -> {
                    // queue1에서 pop하여 queue2로 이동
                    sum1 -= totalQueue[i]
                    i = (i + 1) % totalQueue.size
                }
                sum1 < targetSum -> {
                    // queue2에서 pop하여 queue1로 이동
                    sum1 += totalQueue[j]
                    j = (j + 1) % totalQueue.size
                }
            }
            moves++
        }

        return -1 // 목표 합을 맞출 수 없는 경우
    }
}