// 짝수와 홀수 
class Solution {
    fun solution(num: Int): String {
        var answer = if(num % 2 == 0) "Even" else "Odd"
        return answer
    }
}