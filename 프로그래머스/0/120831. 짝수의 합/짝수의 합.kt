// 짝수의 합

class Solution {
    fun solution(n: Int): Int {
        var answer: Int = (2..n step 2).sum()
        return answer
    }
}