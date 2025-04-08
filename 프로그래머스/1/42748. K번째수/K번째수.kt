class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        val answer = mutableListOf<Int>()
        for ((i, j, k) in commands) {
            val sliced = array.slice(i - 1 until j).sorted()
            answer.add(sliced[k - 1])
        }
        return answer.toIntArray()
    }
}