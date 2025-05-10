// angle이 매개변수로 주어질 때 예각일 때 1, 직각일 때 2, 둔각일 때 3, 평각일 때 4를 반환 
class Solution {
    fun solution(angle: Int): Int = when {
        angle < 90 -> 1 // 예각
        angle == 90 -> 2 // 직각
        angle < 180 -> 3 // 둔각 
        else -> 4 // 평각
    }
}