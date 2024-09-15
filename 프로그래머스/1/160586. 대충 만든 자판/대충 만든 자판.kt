class Solution {
    fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
        val keyMap = mutableMapOf<Char, Int>()
        
        // 각 문자가 자판에서 눌러야 하는 최소 횟수를 저장
        for (key in keymap) {
            for (i in key.indices) {
                val char = key[i]
                keyMap[char] = minOf(keyMap.getOrDefault(char, Int.MAX_VALUE), i + 1)
            }
        }

        val result = mutableListOf<Int>()
        
        // 각 타겟 문자열에 대한 최소 누름 횟수 계산
        for (target in targets) {
            var pressCount = 0
            for (char in target) {
                if (char !in keyMap) {
                    pressCount = -1
                    break
                }
                pressCount += keyMap[char] ?: 0
            }
            result.add(pressCount)
        }
        
        return result.toIntArray()
    }
}
