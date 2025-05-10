// n 이하의 짝수를 모두 더한 값
class Solution {
    fun solution(n: Int): Int = (2..n step 2).sum()
}