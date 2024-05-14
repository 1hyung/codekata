class Solution {
    fun solution(s: String): Int {
        var x = s[0]
        var xCount = 0
        var yCount = 0
        var result = 0
        var cleaned = false

        s.forEachIndexed { index, c ->
            if (cleaned) {
                x = c
                cleaned = false
            }

            if (c == x) xCount += 1
            if (c != x) yCount += 1

            if (xCount == yCount || index == s.lastIndex) {
                result += 1
                cleaned = true
            }
        }

        return result
    }
}