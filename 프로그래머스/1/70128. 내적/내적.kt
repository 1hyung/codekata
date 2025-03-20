class Solution {
    fun solution(a: IntArray, b: IntArray): Int =
        a.zip(b) // a와 b를 Pair 형태로 묶음
         .sumOf { (x, y) -> x * y } // 각 Pair의 곱을 모두 합산
}