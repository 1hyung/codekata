import java.util.Stack

class Solution {
    fun solution(s: String): Int {
        return s.indices.count { isTrue(s.substring(it, s.length) + s.substring(0, it)) }
    }

    fun isTrue(s: String): Boolean {
        val stack = Stack<Char>()
        val brackets = mapOf('(' to ')', '{' to '}', '[' to ']')

        if (s[0] in brackets.values) return false

        for (c in s) {
            if (c in brackets.keys) {
                stack.push(c)
            } else if (stack.isNotEmpty() && brackets[stack.peek()] == c) {
                stack.pop()
            } else {
                return false
            }
        }
        return stack.isEmpty()
    }
}
