class Solution {
    fun solution(n: Int): Int {
        // 1부터 n까지의 숫자 중 짝수만 필터링하여 합을 구함
        return (1..n).filter{it%2 == 0}.sum()
    }
}