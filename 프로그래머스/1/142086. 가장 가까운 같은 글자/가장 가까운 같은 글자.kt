class Solution {
    fun solution(s: String): IntArray {
        val lastSeen = mutableMapOf<Char, Int>()  // 각 문자의 마지막 출현 위치를 저장할 맵
        val result = IntArray(s.length)  // 결과를 저장할 배열

        for (i in s.indices) {
            val char = s[i]
            if (char in lastSeen) {
                result[i] = i - lastSeen[char]!!
            } else {
                result[i] = -1
            }
            lastSeen[char] = i  // 현재 문자의 위치를 업데이트
        }

        return result
    }
}
