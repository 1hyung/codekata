// 나머지가 1이 되는 수 찾기 
class Solution {
    fun solution(n: Int): Int {
        var range = 2 until n
        var answer: Int = range.first{ x -> n % x == 1 }
        return answer
    }
}