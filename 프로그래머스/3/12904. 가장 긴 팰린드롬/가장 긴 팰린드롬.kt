class Solution {
    fun solution(s: String): Int {
        var maxLength = 0

        for (i in s.indices) {
            // 홀수 길이 팰린드롬
            maxLength = maxOf(maxLength, expandFromCenter(s, i, i))
            // 짝수 길이 팰린드롬
            if (i + 1 < s.length) {
                maxLength = maxOf(maxLength, expandFromCenter(s, i, i + 1))
            }
        }

        return maxLength
    }

    private fun expandFromCenter(s: String, left: Int, right: Int): Int {
        var l = left
        var r = right

        while (l >= 0 && r < s.length && s[l] == s[r]) {
            l--
            r++
        }

        return r - l - 1 // 팰린드롬 길이
    }
}