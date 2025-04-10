class Solution {
    fun solution(s: String): IntArray {
        val map = mutableMapOf<Char, Int>() // 각 문자의 마지막 등장 위치 저장
        val result = IntArray(s.length) // 결과를 저장할 배열

        for (i in s.indices) {
            val ch = s[i]
            result[i] = if (map.containsKey(ch)) i - map[ch]!! else -1 // 이전 등장 위치와 거리 계산
            map[ch] = i // 현재 위치 저장
        }

        return result
    }
}