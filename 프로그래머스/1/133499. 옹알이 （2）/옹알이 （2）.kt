// 옹앙이 (2)
class Solution {
    fun solution(babbling: Array<String>): Int {
        val pronunciations = arrayOf("aya", "ye", "woo", "ma")
        var count = 0

        for (word in babbling) {
            var isValid = true
            var previousPronunciation = ""

            var tempWord = word
            while (tempWord.isNotEmpty()) {
                var found = false
                for (pronunciation in pronunciations) {
                    if (tempWord.startsWith(pronunciation)) {
                        // 연속된 발음인지 확인
                        if (pronunciation == previousPronunciation) {
                            isValid = false
                            break
                        }
                        // 발음 처리
                        previousPronunciation = pronunciation
                        tempWord = tempWord.removePrefix(pronunciation)
                        found = true
                        break
                    }
                }
                if (!found) {
                    isValid = false
                    break
                }
            }
            if (isValid) {
                count++
            }
        }

        return count
    }
}
