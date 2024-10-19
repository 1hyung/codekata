import java.util.LinkedList
import java.util.Queue

class Solution {
    fun solution(bridge_length: Int, weight: Int, truck_weights: IntArray): Int {
        val bridge: Queue<Pair<Int, Int>> = LinkedList()  // 다리 위에 있는 트럭 (무게, 들어간 시간)
        var time = 0  // 경과 시간
        var currentWeight = 0  // 현재 다리 위의 트럭들의 무게 합

        var i = 0  // 대기 중인 트럭의 인덱스
        
        while (i < truck_weights.size || bridge.isNotEmpty()) {
            time++  // 1초가 경과
            
            // 시간이 지나 다리를 다 건넌 트럭은 큐에서 제거
            if (bridge.isNotEmpty() && time - bridge.peek().second == bridge_length) {
                currentWeight -= bridge.poll().first
            }
            
            // 대기 트럭이 있고, 다리 위의 트럭 무게 합이 제한을 넘지 않으면 트럭을 다리에 올림
            if (i < truck_weights.size && currentWeight + truck_weights[i] <= weight) {
                bridge.add(Pair(truck_weights[i], time))  // 트럭을 다리에 올리고 들어간 시간을 기록
                currentWeight += truck_weights[i]  // 다리 위의 무게에 트럭의 무게를 더함
                i++  // 다음 대기 트럭으로 이동
            }
        }
        
        return time
    }
}