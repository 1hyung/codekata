class Solution {
    fun solution(n: Int): Int {
        var sum = 0 // 약수의 합을 저장할 변수
        
        for (i in 1..n) { // 1부터 n까지 모든 수 확인
            if ( n % i == 0) sum += i // i가 n의 약수라면 sum에 추가
            
        }
        return sum // 최종 약수의 합 반환
    }
}

// class Solution {
//    fun solution(n: Int): Int =
//        (1..n) // 1부터 n까지 범위 생성
//        .filter { n % it == 0 } // n부터 it으로 나눈 나머지가 0인 값만 남김 -> 약수 필터링
//        .sum() // 약수들의 합 계산
//}