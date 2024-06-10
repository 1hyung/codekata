import java.util.*

class Solution {
    fun solution(priorities: IntArray, location: Int): Int {
        var answer = 0
        val queue: Queue<Pair<Int, Int>> = LinkedList()
        val priorityQueue = PriorityQueue<Int>(Collections.reverseOrder())
        
        for (i in priorities.indices) {
            queue.add(Pair(priorities[i], i))
            priorityQueue.add(priorities[i])
        }
        
        while (true) {
            val current = queue.poll()
            if (current.first == priorityQueue.peek()) {
                priorityQueue.poll()
                answer++
                if (current.second == location) {
                    break
                }
            } else {
                queue.offer(current)
            }
        }
        
        return answer
    }
}