class Solution {
    fun solution(n: Int): Int {
        var num = n // 입력값을 변경할 변수 
        var sum = 0 // 합계를 저장할 변수 
        
        while (num > 0) { // num가 0이 될 때까지 반복
            sum += num % 10 // 1. 마지막 자릿수를 sum에 추가 
            num /= 10 // 2. 마지막 자릿수를 제거
        }
        return sum // 최종 합 반환
    }
}