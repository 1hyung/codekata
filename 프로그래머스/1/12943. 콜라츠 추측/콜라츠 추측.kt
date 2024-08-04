class Solution {
    fun solution(num: Int): Int {
        var count = 0
        var current = num.toLong() // Long 타입으로 변환하여 오버플로우 방지

        while (current != 1L) {
            if (count >= 500) {
                return -1
            }
            current = if (current % 2 == 0L) {
                current / 2
            } else {
                current * 3 + 1
            }
            count++
        }
        return count
    }
}
