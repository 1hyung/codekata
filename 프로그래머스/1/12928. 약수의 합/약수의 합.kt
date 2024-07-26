class Solution {
    fun solution(n: Int): Int {
        var answer = 0 // answer 변수를 선언하고 초기화
        
        // 1부터 n까지의 모든 수를 순회하며 약수를 찾습니다.
        for (i in 1..n) {
            if (n % i == 0) {
                answer += i // 약수를 발견하면 answer에 더합니다.
            }
        }
        
        // 최종적으로 약수의 합을 반환합니다.
        return answer
    }
}