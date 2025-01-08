class Solution {
    fun solution(n: Long): Long =
        Math.sqrt(n.toDouble()) // n의 제곱근을 계산 (Double 타입)
            .toLong() // 정수(Long)로 변환
            .let { sqrt -> // let 스코프 함수로 sqrt 임시 변수 생성
                if ( sqrt * sqrt == n) // sqrt^2 == n인지 확인
                    ( sqrt + 1 ) * ( sqrt + 1 ) // 참일 경우
                else 
                    -1 // 거짓일 경우 
            }
}