import java.util.*

class Solution {
    fun solution(operations: Array<String>): IntArray {
        val queue = TreeMap<Int, Int>() // TreeMap을 사용하여 숫자를 키로, 개수를 값으로 저장

        for (operation in operations) {
            val (cmd, numStr) = operation.split(" ")
            val num = numStr.toInt()

            when (cmd) {
                "I" -> {
                    // 삽입 연산
                    queue[num] = queue.getOrDefault(num, 0) + 1
                }
                "D" -> {
                    // 삭제 연산
                    if (queue.isNotEmpty()) {
                        val key = if (num == 1) queue.lastKey() else queue.firstKey()
                        if (queue[key] == 1) {
                            queue.remove(key)
                        } else {
                            queue[key] = queue[key]!! - 1
                        }
                    }
                }
            }
        }

        return if (queue.isEmpty()) {
            intArrayOf(0, 0)
        } else {
            intArrayOf(queue.lastKey(), queue.firstKey())
        }
    }
}