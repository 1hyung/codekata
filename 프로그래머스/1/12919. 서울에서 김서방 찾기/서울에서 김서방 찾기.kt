class Solution {
    fun solution(seoul: Array<String>): String {
        // "Kim"의 위치를 찾습니다.
        val position = seoul.indexOf("Kim")
        
        // 위치를 포함한 문자열을 생성하여 반환합니다.
        return "김서방은 ${position}에 있다"
    }
}
