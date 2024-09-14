class Solution {
    fun solution(s: String): Int {
        var countX = 0 // 첫 글자와 같은 글자의 개수
        var countOther = 0 // 첫 글자와 다른 글자의 개수
        var answer = 0 // 분리된 문자열의 개수
        var firstChar = s[0] // 첫 글자를 기준으로 분리

        for (i in s.indices) {
            if (s[i] == firstChar) {
                countX++
            } else {
                countOther++
            }

            // x와 다른 글자의 개수가 같아지면 분리
            if (countX == countOther) {
                answer++
                // 새로운 첫 글자 설정
                if (i + 1 < s.length) {
                    firstChar = s[i + 1]
                }
                countX = 0
                countOther = 0
            }
        }
        // 마지막 남은 부분 처리
        if (countX != 0 || countOther != 0) {
            answer++
        }
        return answer
    }
}
