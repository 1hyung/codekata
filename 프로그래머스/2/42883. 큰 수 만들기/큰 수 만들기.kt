class Solution {
    fun solution(number: String, k: Int): String {
        val stack = mutableListOf<Char>() // 스택처럼 사용할 리스트
        var removeCount = k // 제거할 수 있는 횟수

        for (digit in number) {
            // 스택이 비어 있지 않고, 제거할 기회가 남아있으며, 스택의 마지막 숫자보다 현재 숫자가 크다면 스택에서 제거
            while (stack.isNotEmpty() && removeCount > 0 && stack.last() < digit) {
                stack.removeAt(stack.size - 1) // 마지막 요소 제거
                removeCount--
            }
            stack.add(digit) // 현재 숫자를 스택에 추가
        }

        // 제거할 기회가 남아있다면, 뒤에서부터 제거
        while (removeCount > 0) {
            stack.removeAt(stack.size - 1)
            removeCount--
        }

        // 스택을 문자열로 변환하여 반환
        return stack.joinToString("")
    }
}