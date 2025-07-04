// 가운데 글자 가져오기 
class Solution {
    fun solution(s: String): String {
        val len = s.length
        val mid = len / 2 // 가운데 인덱스 계산

        return if (len % 2 == 1) { // 길이가 홀수인 경우
            s.substring(mid, mid + 1) // 가운데 글자 1개
        } else { // 길이가 짝수인 경우
            s.substring(mid - 1, mid + 1) // 가운데 글자 2개
        }
    }
}