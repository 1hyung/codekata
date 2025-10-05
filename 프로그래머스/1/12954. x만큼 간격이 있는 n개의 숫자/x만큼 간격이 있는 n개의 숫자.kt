// x만큼 간격이 있는 n개의 숫자
class Solution {
    fun solution(x: Int, n: Int): List<Long> {
        return (1..n).map{it.toLong()*x}
    }
}