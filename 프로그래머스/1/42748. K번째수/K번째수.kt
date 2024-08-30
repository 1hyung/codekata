class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        return commands.map { command ->
            val (i, j, k) = command
            array.slice(i-1 until j).sorted()[k-1]
        }.toIntArray()
    }
}
