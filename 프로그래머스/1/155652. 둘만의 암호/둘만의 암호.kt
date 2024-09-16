class Solution {
    fun solution(s: String, skip: String, index: Int): String {
        val alphabet = ('a'..'z').filterNot { it in skip }
        val result = StringBuilder()

        for (char in s) {
            val currentIndex = alphabet.indexOf(char)
            val newIndex = (currentIndex + index) % alphabet.size
            result.append(alphabet[newIndex])
        }

        return result.toString()
    }
}
