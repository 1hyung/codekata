class Solution {
    fun solution(s: String): Int {
        var count = 0
        val n = s.length

        for (i in 0 until n) {
            val rotated = s.substring(i, n) + s.substring(0, i)
            if (isValid(rotated)) {
                count++
            }
        }

        return count
    }

    private fun isValid(s: String): Boolean {
        val stack = mutableListOf<Char>()

        for (char in s) {
            when (char) {
                '(', '[', '{' -> stack.add(char)
                ')' -> {
                    if (stack.isEmpty() || stack.removeAt(stack.size - 1) != '(') return false
                }
                ']' -> {
                    if (stack.isEmpty() || stack.removeAt(stack.size - 1) != '[') return false
                }
                '}' -> {
                    if (stack.isEmpty() || stack.removeAt(stack.size - 1) != '{') return false
                }
            }
        }

        return stack.isEmpty()
    }
}
