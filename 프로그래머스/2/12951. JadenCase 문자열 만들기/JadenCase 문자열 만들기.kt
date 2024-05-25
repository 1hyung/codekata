class Solution {
    fun solution(s: String): String {
        return s.lowercase().split(" ").joinToString(" ") { it.replaceFirstChar { char -> char.uppercase() } }
    }
}