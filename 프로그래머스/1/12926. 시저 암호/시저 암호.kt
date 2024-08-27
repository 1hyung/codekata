class Solution {
    fun solution(s: String, n: Int): String {
        return s.map { char ->
            when {
                char.isUpperCase() -> 'A' + (char - 'A' + n) % 26
                char.isLowerCase() -> 'a' + (char - 'a' + n) % 26
                else -> char
            }
        }.joinToString("")
    }
}
