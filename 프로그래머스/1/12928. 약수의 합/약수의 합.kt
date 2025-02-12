class Solution {
    fun solution(n: Int): Int {
        var sum = 0 // 약수들의 합을 저장할 변수
        
        for (i in 1..n) { // 1부터 n까지 반복
            if (n % i == 0) { // n을 i로 나눴을 때 나머지가 0이면 약수
                sum += i // 약수를 sum에 더함
            }
        }
        
        return sum // 최종 합 반환
    }
}