class Solution {
    fun solution(angle: Int): Int {
        return when{
            angle in 1 until 90 -> 1 // 예각 (0 < angle < 90)
            angle == 90 -> 2 // 직각 (angle = 90)
            angle in 91 until 180 -> 3 // 둔각 (90 < angle < 180)
            angle == 180 -> 4 // 평각 (angle = 180)
            else -> throw IllegalArgumentException("Invalid angle") // 유효하지 않은 각도 처리
        }
    }
}