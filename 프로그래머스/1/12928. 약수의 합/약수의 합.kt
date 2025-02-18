class Solution {
    fun solution(n: Int): Int {
        var sum = 0 // 약수의 합을 저장할 변수
        
        for (i in 1..n) { // 1부터 n까지 모든 수 확인
            if ( n % i == 0) sum += i // i가 n의 약수라면 sum에 추가
            
        }
        return sum // 최종 약수의 합 반환
    }
}