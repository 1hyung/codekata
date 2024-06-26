class Solution {
    fun solution(queue1: IntArray, queue2: IntArray): Long {
        var answer: Long = 0
        
        var dq1 = ArrayDeque<Long>()
        var dq2 = ArrayDeque<Long>()
        
        queue1.forEach { dq1.add(it.toLong()) }
        queue2.forEach { dq2.add(it.toLong()) }
        
        var sumOfQueue1: Long = dq1.sum()
        var sumOfQueue2: Long = dq2.sum()
        
        var limitLoopCount = queue1.size * 4
        
        while (answer <= limitLoopCount) {
            if (sumOfQueue1 == sumOfQueue2) {
                return answer 
            }
             
            ++answer 
             
            if (sumOfQueue1 < sumOfQueue2) {
                var element = dq2.first()
                dq1.add(element)
                dq2.removeFirst()
                sumOfQueue1 += element
                sumOfQueue2 -= element
            } else {
                var element = dq1.first()
                dq2.add(element)
                dq1.removeFirst()
                sumOfQueue2 += element
                sumOfQueue1 -= element
            }
        } 
        
        return -1  
    }
}