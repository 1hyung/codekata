class Solution {
    fun solution(phone_number: String): String =
        "*".repeat(phone_number.length - 4) + phone_number.takeLast(4) // 앞부분을 *로 채우고 뒷 4자리 유지
}