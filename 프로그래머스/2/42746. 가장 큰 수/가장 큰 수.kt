// 가장 큰 수 
class Solution {
    fun solution(numbers: IntArray): String {
        // 1. numbers 배열을 문자열로 변환하여 내림차순으로 정렬
        val sortedNumbers = numbers
            .map { it.toString() }  // 숫자를 문자열로 변환
            .sortedWith(Comparator { a, b ->
                (b + a).compareTo(a + b)  // 두 숫자를 붙였을 때 더 큰 순서대로 정렬
            })

        // 2. 정렬된 결과를 이어 붙임
        val result = sortedNumbers.joinToString("")

        // 3. 만약 가장 큰 숫자가 "0"이면, 결과는 "0"이어야 함
        return if (result.startsWith("0")) "0" else result
    }
}