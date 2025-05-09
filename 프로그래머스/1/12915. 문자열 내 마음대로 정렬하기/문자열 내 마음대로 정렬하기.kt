class Solution {
    fun solution(strings: Array<String>, n: Int): Array<String> =
        strings.sortedWith(compareBy({ it[n] }, { it })).toTypedArray()
}