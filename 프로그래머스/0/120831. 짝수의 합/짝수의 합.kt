// n 이하의 짝수를 모두 더한 값을 반환하는 함수
class Solution {
    fun solution(n: Int): Int =
        (2..n step 2).sum() // 2부터 n까지 2씩 증가하며 모든 값을 더함
}