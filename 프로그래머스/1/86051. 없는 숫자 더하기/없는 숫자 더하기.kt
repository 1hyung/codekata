class Solution {
    fun solution(numbers: IntArray) = (0..9).filter { !numbers.contains(it) }.sum()
}