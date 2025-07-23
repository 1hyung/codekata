// 약수의 합
class Solution {
    fun solution(n: Int): Int {
        var answer = (1..n).filter{n % it == 0}.sum()
        return answer
    }
}