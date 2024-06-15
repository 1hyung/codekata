class Solution {
    fun solution(numbers: IntArray): IntArray {
        val answer: IntArray = IntArray(numbers.size) { -1 } 
        val stack = mutableListOf<Int>() 

        numbers.forEachIndexed { i, number -> 
            while (stack.isNotEmpty() && number > numbers[stack.last()]) {
                val topIndex = stack.removeLast() 
                answer[topIndex] = number 
            }
            stack.add(i) 
        }

        return answer 
    }
}
