class Solution {
    fun solution(n: Int): Int {
        var x = 2 // 2부터 시작 
        while ( n % x != 1) { // 나머지가 1이 아닐 경우 x를 증가
            x++
        }
        return x
    }
}