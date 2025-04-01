class Solution {
    fun solution(s: String): String =
        s.split(" ") // 공백을 기준으로 단어 나누기
            .joinToString(" ") { word -> // 다시 공백으로 연결
                word.mapIndexed { index, c ->
                    if (index % 2 == 0) c.uppercaseChar() else c.lowercaseChar()
                }.joinToString("")
            }
}