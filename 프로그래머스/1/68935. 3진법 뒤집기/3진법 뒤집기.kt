class Solution {
    fun solution(n: Int): Int {
        // 10진수를 3진수로 변환
        val ternary = n.toString(3)
        
        // 3진수를 뒤집기
        val reversedTernary = ternary.reversed()
        
        // 뒤집힌 3진수를 10진수로 변환
        return reversedTernary.toInt(3)
    }
}
