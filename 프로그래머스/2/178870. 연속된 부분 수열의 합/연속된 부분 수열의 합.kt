class Solution {
    fun solution(sequence: IntArray, k: Int): IntArray {
        var answer: IntArray = intArrayOf()
        val pSum = LongArray(sequence.size + 1)
        for (i in 1..sequence.size) {
            pSum[i] = pSum[i - 1] + sequence[i - 1]
        }
        
        for (cnt in 1..sequence.size) {
            var left = -1
            var right = -1
            var s = 0
            var e = sequence.size - cnt
            while (s <= e) {
                val mid = (s + e) / 2
                val sum = pSum[mid + cnt] - pSum[mid]
                if (sum >= k) {
                    if (sum == k.toLong()) {
                        left = mid
                        right = mid + cnt - 1
                    }
                    e = mid - 1
                } else {
                    s = mid + 1
                }
            }
            if (left != -1 && right != -1) return intArrayOf(left, right)
        }
        return answer
    }
}