class Solution {
    fun solution(n: Int): String {
        val sb = StringBuilder()
        repeat(n) { i ->
            sb.append(if (i % 2 == 0) "수" else "박")
        }
        return sb.toString()
    }
}