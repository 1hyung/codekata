import java.util.Stack

class Solution {
    fun solution(order: IntArray): Int {
        var answer = 0
        val stack = Stack<Int>()
        var index = 0
        var box = 1
        
        while (box <= order.size) {
            var currentOrder = order[index]
            
            // 현재 상자를 실을 수 있는지 확인 (컨테이너 벨트 또는 스택에서)
            while (box == currentOrder || (stack.isNotEmpty() && stack.peek() == currentOrder)) {
                if (box == currentOrder) {
                    box++
                } else {
                    stack.pop()
                }
                answer++
                index++
                
                // 모든 상자를 다 처리했을 경우 빠르게 종료
                if (index >= order.size) break
                
                currentOrder = order[index]  // 다음 상자 확인
            }
            
            // 트럭에 실을 수 없는 상자는 스택에 넣기
            stack.push(box++)
        }
        
        return answer
    }
}