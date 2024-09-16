class Solution {
    fun solution(s: String, skip: String, index: Int): String {
        // 'a'부터 'z'까지 중 skip에 없는 알파벳만 리스트로 만듦
        val alphabet = ('a'..'z').filterNot { it in skip }
        val result = StringBuilder()

        // s의 각 문자를 변환
        for (char in s) {
            val currentIndex = alphabet.indexOf(char)
            val newIndex = (currentIndex + index) % alphabet.size
            result.append(alphabet[newIndex])
        }

        return result.toString()  // 변환된 문자열 반환
    }
}
