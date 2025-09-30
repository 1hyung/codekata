// 자릿수 더하기
class Solution {
    fun solution(n: Int): Int {
        return n.toString().map{n -> n.toString().toInt()}.sum()
    }
}