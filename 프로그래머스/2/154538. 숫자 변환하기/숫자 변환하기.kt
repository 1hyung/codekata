import java.util.LinkedList
import java.util.Queue

class Solution {
    fun solution(x: Int, y: Int, n: Int): Int {
        if (x == y) return 0  // 시작 숫자가 이미 목표 숫자라면 연산 횟수는 0
        
        val visited = BooleanArray(y + 1) { false }  // 방문 여부 체크 배열
        val queue: Queue<Pair<Int, Int>> = LinkedList()  // (현재 숫자, 연산 횟수)
        
        queue.offer(Pair(x, 0))  // 시작점 넣기
        visited[x] = true
        
        while (queue.isNotEmpty()) {
            val (current, count) = queue.poll()
            
            // 세 가지 연산 수행
            val nextNumbers = listOf(current + n, current * 2, current * 3)
            for (next in nextNumbers) {
                if (next == y) {
                    return count + 1  // 목표 숫자에 도달하면 연산 횟수 반환
                }
                if (next <= y && !visited[next]) {  // y보다 작거나 같은 값만 탐색
                    visited[next] = true
                    queue.offer(Pair(next, count + 1))
                }
            }
        }
        
        return -1  // 끝까지 탐색했지만 y에 도달하지 못한 경우
    }
}