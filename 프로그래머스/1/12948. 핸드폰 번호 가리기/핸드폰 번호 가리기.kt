// 핸드폰 번호 가리기

class Solution {
    fun solution(phone_number: String): String =
        "*".repeat(phone_number.length - 4) + phone_number.takeLast(4) // 앞은 *로 채우고, 뒤 4자리는 그대로
}