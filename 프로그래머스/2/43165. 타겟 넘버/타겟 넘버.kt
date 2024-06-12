class Solution {
    fun find(numbers: IntArray, depth: Int, sum: Int, target: Int): Int {
        if (depth == numbers.size) {
            return if (sum == target) 1 else 0
        }
        return find(numbers, depth + 1, sum + numbers[depth], target) +
               find(numbers, depth + 1, sum - numbers[depth], target)
    }
    
    fun solution(numbers: IntArray, target: Int): Int {
        return find(numbers, 0, 0, target)
    }
}