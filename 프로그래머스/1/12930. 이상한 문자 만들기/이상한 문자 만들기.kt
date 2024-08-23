class Solution {
    fun solution(s: String): String {
        return s.split(" ").joinToString(" ") { word ->
            word.mapIndexed { index, char ->
                if (index % 2 == 0) char.uppercaseChar() else char.lowercaseChar()
            }.joinToString("")
        }
    }
}
