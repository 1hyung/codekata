import java.util.*

class Solution {
    fun solution(begin: String, target: String, words: Array<String>): Int {
        if (target !in words) return 0 // target이 words에 없으면 변환 불가능

        val queue: Queue<Pair<String, Int>> = LinkedList()
        val visited = mutableSetOf<String>()

        queue.offer(Pair(begin, 0)) // 시작 단어와 변환 단계
        visited.add(begin)

        while (queue.isNotEmpty()) {
            val (currentWord, steps) = queue.poll()

            if (currentWord == target) return steps

            for (word in words) {
                if (!visited.contains(word) && canTransform(currentWord, word)) {
                    queue.offer(Pair(word, steps + 1))
                    visited.add(word)
                }
            }
        }

        return 0 // 변환할 수 없는 경우
    }

    private fun canTransform(word1: String, word2: String): Boolean {
        var diffCount = 0
        for (i in word1.indices) {
            if (word1[i] != word2[i]) diffCount++
            if (diffCount > 1) return false
        }
        return diffCount == 1
    }
}