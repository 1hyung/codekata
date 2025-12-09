// 이전 변환 반복하기
class Solution {
    fun solution(s: String): IntArray {
        var transformationCount = 0 // 이진 변환의 횟수를 저장
        var removedZeroCount = 0    // 제거된 0의 개수를 저장

        var currentString = s
        
        // 문자열이 "1"이 될 때까지 반복
        while (currentString != "1") {
            // 1. 현재 문자열에서 0을 모두 제거
            val zeroCount = currentString.count { it == '0' }
            removedZeroCount += zeroCount

            // 2. 0을 제거한 후 남은 문자열의 길이를 이진법으로 변환
            currentString = currentString.replace("0", "")
            val length = currentString.length
            currentString = length.toString(radix = 2) // 길이를 2진수 문자열로 변환

            // 3. 변환 횟수 증가
            transformationCount++
        }
        
        // 변환 횟수와 제거된 0의 개수를 배열로 반환
        return intArrayOf(transformationCount, removedZeroCount)
    }
}
