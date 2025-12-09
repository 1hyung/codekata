// 피보나치 수
class Solution {
    fun solution(n: Int): Int {
        val mod = 1234567
        var a = 0 // F(0)
        var b = 1 // F(1)
        
        // 2 이상부터 n번째 피보나치 수를 계산
        for (i in 2..n) {
            val temp = (a + b) % mod
            a = b
            b = temp
        }
        
        // n번째 피보나치 수를 반환
        return b
    }
}
