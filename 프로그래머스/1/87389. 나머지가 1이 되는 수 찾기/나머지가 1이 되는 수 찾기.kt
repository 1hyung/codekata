// 나머지가 1이 되는 수 찾기
class Solution {
    fun solution(n: Int): Int {
        var answer: Int = (2 until n).first {n % it == 1}
        return answer
    }
}