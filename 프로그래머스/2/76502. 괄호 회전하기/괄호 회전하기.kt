// 괄호 회전하기
class Solution {
    fun solution(s: String): Int {
        var count = 0 // 올바른 괄호 문자열이 되는 회전 횟수를 저장할 변수
        val n = s.length // 문자열의 길이 저장

        // 문자열을 왼쪽으로 i칸만큼 회전하며 올바른 괄호 문자열인지 확인
        for (i in 0 until n) {
            // 문자열 s를 왼쪽으로 i칸 회전시킨 결과
            val rotated = s.substring(i, n) + s.substring(0, i)
            // 회전된 문자열이 올바른 괄호 문자열인지 확인
            if (isValid(rotated)) {
                count++ // 올바른 경우 횟수 증가
            }
        }

        return count // 최종적으로 올바른 괄호 문자열이 된 횟수를 반환
    }

    // 괄호 문자열이 올바른지 판단하는 함수
    private fun isValid(s: String): Boolean {
        val stack = mutableListOf<Char>() // 괄호를 저장할 스택

        // 문자열의 각 문자에 대해 반복
        for (char in s) {
            when (char) {
                '(', '[', '{' -> stack.add(char) // 여는 괄호는 스택에 추가
                ')' -> {
                    // 닫는 소괄호가 나왔을 때 스택이 비어있거나 짝이 맞지 않으면 false 반환
                    if (stack.isEmpty() || stack.removeAt(stack.size - 1) != '(') return false
                }
                ']' -> {
                    // 닫는 대괄호가 나왔을 때 스택이 비어있거나 짝이 맞지 않으면 false 반환
                    if (stack.isEmpty() || stack.removeAt(stack.size - 1) != '[') return false
                }
                '}' -> {
                    // 닫는 중괄호가 나왔을 때 스택이 비어있거나 짝이 맞지 않으면 false 반환
                    if (stack.isEmpty() || stack.removeAt(stack.size - 1) != '{') return false
                }
            }
        }

        // 스택이 비어있으면 모든 괄호가 올바르게 짝지어진 것이므로 true 반환
        return stack.isEmpty()
    }
}
