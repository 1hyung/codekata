// 나머지가 1이 되는 수 찾기 
class Solution {
    fun solution(n: Int): Int {
        return (2 until n).first{ x -> n % x == 1}
    }
}