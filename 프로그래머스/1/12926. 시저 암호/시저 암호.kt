class Solution {
    fun solution(s: String, n: Int): String = 
        s.map { 
            when {
                it.isUpperCase() -> 'A' + (it - 'A' + n) % 26 // 대문자 변환
                it.isLowerCase() -> 'a' + (it - 'a' + n) % 26 // 소문자 변환
                else -> it // 공백은 그대로 유지
            }
        }.joinToString("") // 리스트를 문자열로 변환
}