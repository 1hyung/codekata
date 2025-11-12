// 나머지가 1이 되는 수 찾기
// 답이 항상 존재함은 증명될 수 있기 때문에 null 처리가 필요없음

class Solution {
    fun solution(n: Int): Int = (2 until n).first{ x -> n % x == 1}
}