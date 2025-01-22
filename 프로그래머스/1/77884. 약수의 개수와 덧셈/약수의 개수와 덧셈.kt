class Solution {
    // 주어진 범위의 숫자를 순회하며 약수 개수에 따라 더하거나 뺀 결과를 반환하는 함수
    fun solution(left: Int, right: Int): Int =
        (left..right) // left부터 right까지의 범위 생성
            .sumOf { n -> // 각 숫자의 결과를 계산하여 합산
                val sqrt = Math.sqrt(n.toDouble()).toInt() // n의 제곱근을 계산하고 정수로 변환
                if (sqrt * sqrt == n) -n // 제곱근의 제곱이 n과 같다면 제곱수 → 약수 개수는 홀수 → 음수 처리
                else n // 그렇지 않으면 약수 개수는 짝수 → 양수 처리
            }
}