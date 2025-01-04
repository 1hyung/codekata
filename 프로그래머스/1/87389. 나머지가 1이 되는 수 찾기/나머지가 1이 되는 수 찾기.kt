class Solution {
    // 자연수 n을 2부터 n까지 순회하며, 나머지가 1이 되는 가장 작은 수를 반환하는 함수
    fun solution(n: Int): Int = 
        (2..n) // 2부터 n까지의 범위를 생성
            .first { n % it == 1 } // 나머지가 1이 되는 첫 번째 값을 반환
}