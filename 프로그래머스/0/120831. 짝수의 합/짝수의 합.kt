// 짝수의 합
// n 이하의 모든 짝수를 모두 더한 값을 반환
class Solution {
    fun solution(n: Int) =
        (2..n step 2) // 2부터 n까지 2씩 증가
            .sum() // 해당 숫자들을 모두 더함
}