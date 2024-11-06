import kotlin.math.*

class Solution {
    fun solution(w: Int, h: Int): Long {
        val gcdValue = gcd(w, h)
        val unusableSquares = w.toLong() + h.toLong() - gcdValue
        return w.toLong() * h.toLong() - unusableSquares
    }
    
    // 최대 공약수 계산 함수
    private fun gcd(a: Int, b: Int): Long {
        return if (b == 0) a.toLong() else gcd(b, a % b)
    }
}