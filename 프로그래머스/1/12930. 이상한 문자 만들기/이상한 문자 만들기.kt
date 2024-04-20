class Solution {
    fun solution(s: String): String =
        s.split(" ").joinToString(" ") {
            it.mapIndexed { i, c ->
                when (i % 2) {
                    0 -> c.toUpperCase()
                    else -> c.toLowerCase()
                }
            }.joinToString("")
        }
}