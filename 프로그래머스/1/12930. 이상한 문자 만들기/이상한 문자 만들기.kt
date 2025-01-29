class Solution {
    fun solution(s: String): String {
        return s.split(" ".toRegex()) // 공백을 포함하여 단어 분리
            .map { word -> // 각 단어를 변환
                word.mapIndexed { index, char ->
                    if (index % 2 == 0) char.uppercaseChar() // 짝수 인덱스: 대문자로 변환
                    else char.lowercaseChar() // 홀수 인덱스: 소문자로 변환
                }.joinToString("") // 변환된 문자들을 하나의 단어로 합침
            }
            .joinToString(" ") // 변환된 단어들을 공백을 유지하며 합침
    }
}