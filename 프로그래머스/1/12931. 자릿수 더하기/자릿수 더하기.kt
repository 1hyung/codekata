class Solution {
    fun solution(n: Int): Int {
        var num = n // 입력값 n을 변수 num에 저장 (num은 자릿수를 분리하면서 값을 변경)
        var sum = 0 // 각 자릿수의 합을 저장할 변수 sum 선언
        
        while (num > 0) { // num이 0이 될 때까지 반복
            sum += num % 10 // 1. num의 마지막 자릿수를 sum에 더 함
            num /= 10 // 2. 마지막 자릿수를 제거 (num을 10으로 나눔)
        }
        
        return sum // 자릿수의 합 반환

    }
}