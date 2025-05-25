// 나머지가 1이 되는 수 찾기
class Solution {
    fun solution(n: Int) =
        (2 until n) // 2부터 n-1까지 범위 생성 (n 포함 x)
            .first { n % it == 1 }// 나머지 1이 되는 첫 번째 숫자를 찾고 반환
}