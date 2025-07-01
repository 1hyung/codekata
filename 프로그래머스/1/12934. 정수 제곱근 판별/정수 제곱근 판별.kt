// 정수 제곱근 판별 
// 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단
// n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성
import kotlin.math.sqrt

class Solution {
    fun solution(n: Long): Long {
        var x = sqrt(n.toDouble()).toLong() // n의 제곱근을 구하고, 정수 부분만 사용
        
        return if (x * x == n) (x + 1) * (x + 1) else -1
    }
}