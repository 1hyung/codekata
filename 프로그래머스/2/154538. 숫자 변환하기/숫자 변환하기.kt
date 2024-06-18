import java.util.LinkedList
import java.util.Queue

class Solution {
    fun solution(x: Int, y: Int, n: Int): Int {
        val queue: Queue<Pair<Int, Int>> = LinkedList() 
        val visited = mutableSetOf<Int>() 

        queue.add(Pair(x, 0)) 
        visited.add(x)

        while (queue.isNotEmpty()) {
            val (current, depth) = queue.poll()
            if (current == y) return depth 

            listOf(current + n, current * 2, current * 3).forEach { next ->
                if (next <= y && next !in visited) {
                    queue.add(Pair(next, depth + 1))
                    visited.add(next)
                }
            }
        }
        return -1 
    }
}
