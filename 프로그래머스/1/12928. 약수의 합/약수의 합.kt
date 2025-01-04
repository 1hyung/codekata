class Solution {
    // 반복문을 활용한 풀이
    fun solution(n: Int): Int {
        var sum = 0
        for (i in 1..n) { // i가 1부터 n가지 반복
            if (n % i == 0) { // i가 n의 약수인지 확인
                sum += i // 약수를 합산
            }
        }
        return sum 
    }
}