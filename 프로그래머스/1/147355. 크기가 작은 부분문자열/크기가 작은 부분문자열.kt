class Solution {
    fun solution(t: String, p: String): Int {
        var count = 0
        val pLength = p.length
        val pNum = p.toLong()  // p를 숫자로 변환

        // t에서 p와 같은 길이의 부분 문자열을 추출하여 비교
        for (i in 0..t.length - pLength) {
            val subNum = t.substring(i, i + pLength).toLong()
            if (subNum <= pNum) {
                count++
            }
        }

        return count
    }
}
