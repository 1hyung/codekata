import java.util.*

class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        val queue: Queue<Int> = LinkedList() 
        val result = mutableListOf<Int>() 
        
        for (i in progresses.indices) {
            val remain = 100 - progresses[i] 
            val curSpeed = speeds[i]
            val daysRequired = if (remain % curSpeed == 0) {
                remain / curSpeed
            } else {
                remain / curSpeed + 1
            }
            queue.offer(daysRequired)
        }
        
        while (queue.isNotEmpty()) {
            var deployCount = 1 
            val current = queue.poll() 
            
            while (queue.isNotEmpty() && queue.peek() <= current) {
                queue.poll()
                deployCount++
            }
            
            result.add(deployCount)
        }
        
        return result.toIntArray()
    }
}