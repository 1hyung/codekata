class Solution {
    fun solution(numbers: IntArray): IntArray {
        val result = IntArray(numbers.size) { -1 }  // 결과 배열을 -1로 초기화
        val stack = mutableListOf<Int>()            // 스택 초기화

        for (i in numbers.indices.reversed()) {     // 배열을 뒤에서부터 순회
            while (stack.isNotEmpty() && stack.last() <= numbers[i]) {
                stack.removeAt(stack.size - 1)      // 스택에서 현재 숫자보다 작거나 같은 숫자를 제거
            }
            if (stack.isNotEmpty()) {
                result[i] = stack.last()            // 뒷 큰수를 찾은 경우 결과 배열에 기록
            }
            stack.add(numbers[i])                   // 현재 숫자를 스택에 추가
        }

        return result
    }
}
