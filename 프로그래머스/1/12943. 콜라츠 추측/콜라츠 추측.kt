class Solution {
    fun solution(num: Int): Int {
        var current = num.toLong()
        var count = 0
        
        while (current != 1L && count < 500) { // 1이 되거나 500번 넘으면 종료
            current = if (current % 2 == 0L) current / 2 else current * 3 + 1
            count++
        }
        
        return if (count < 500) count else -1 // 500번 넘었으면 -1 반환
    }
}