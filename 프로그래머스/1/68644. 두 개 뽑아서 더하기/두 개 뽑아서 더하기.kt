class Solution {
    fun solution(numbers: IntArray): IntArray {
        val sums = mutableSetOf<Int>()

        for (i in numbers.indices) {
            for (j in i + 1 until numbers.size) {
                sums.add(numbers[i] + numbers[j])
            }
        }

        return sums.sorted().toIntArray()
    }
}
