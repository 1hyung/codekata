class Solution {
    fun solution(s: String): IntArray {
        val lastSeen = mutableMapOf<Char, Int>() // 각 문자의 마지막 위치 저장

        return s.mapIndexed { i, char ->
            val distance = lastSeen[char]?.let { i - it } ?: -1 // 존재하면 거리 계산, 없으면 -1
            lastSeen[char] = i // 현재 문자의 위치 업데이트
            distance
        }.toIntArray()
    }
}