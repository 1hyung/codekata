class Solution {
    // 전화번호의 일부를 '*'로 가리고 반환하는 함수
    fun solution(phone_number: String): String {
        return "*".repeat(phone_number.length - 4) + // '*'로 가린 부분
            phone_number.takeLast(4) // 뒷 4자리와 결합하여 반환
    }
}