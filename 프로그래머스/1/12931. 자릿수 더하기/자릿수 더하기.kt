class Solution {
    fun solution(n: Int): Int =
        n.toString().map {
            it.toInt() - '0'.toInt()
        }.sum()
}