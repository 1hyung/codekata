// 각도기
class Solution {
    fun solution(angle: Int): Int = when (angle) {
        in 1 until 90 -> 1     // 예각
        90 -> 2                // 직각
        in 91 until 180 -> 3   // 둔각
        180 -> 4               // 평각
        else -> throw IllegalArgumentException("잘못된 각도입니다")
    }
}