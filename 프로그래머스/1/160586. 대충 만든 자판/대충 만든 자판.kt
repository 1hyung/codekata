class Solution {
    fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
        val keyHashMap = mutableMapOf<Char, Int>()
        val result = mutableListOf<Int>()

        keymap.forEachIndexed { i, key ->
            key.forEachIndexed { j, value ->
                if (j < (keyHashMap[value] ?: 1000)) {
                    keyHashMap[value] = j + 1
                }
            }
        }

        targets.forEachIndexed { i, target ->
            var count = 0
            target.forEachIndexed { j, value ->
                count += keyHashMap[value] ?: 1000
            }
            result.add(if (count < 1000) count else -1)
        }

        return result.toIntArray()
    }
}