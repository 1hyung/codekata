class Solution {
    fun solution(n: Int): Int {
        return (2..n step 2).sum() // 2부터 n까지 2씩 증가하며 합산
    }
}