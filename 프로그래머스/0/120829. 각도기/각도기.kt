class Solution {
    fun solution(angle: Int): Int {
        return when{
            angle in 1 until 90 -> 1 // 예각 (0 < angle < 90)
            angle == 90 -> 2 // 직각 (angle = 90)
            angle in 91 until 180 -> 3 // 둔각 (90 < angle < 180)
            else -> 4
        }
    }
}