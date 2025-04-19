class Solution {
    fun solution(seoul: Array<String>): String {
        val index = seoul.indexOf("Kim") // "Kim"의 위치를 indexOf로 찾음
        return "김서방은 ${index}에 있다" // 문자열 템플릿으로 문장 생성
    }
}