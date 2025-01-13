class Solution {
    fun solution(seoul: Array<String>): String {
        val position = seoul.indexOf("Kim") // "Kim"의 위치를 찾음
        return "김서방은 ${position}에 있다" // 위치를 문자열 템플릿으로 반환
    }
}