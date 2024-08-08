class Solution {
    fun solution(phone_number: String): String {
        val length = phone_number.length
        val maskedPart = "*".repeat(length - 4)
        val lastFourDigits = phone_number.takeLast(4)
        return maskedPart + lastFourDigits
    }
}
