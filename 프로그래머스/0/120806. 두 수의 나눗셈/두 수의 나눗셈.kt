class Solution {
    fun solution(num1: Int, num2: Int): Int {
        var divisionResult = num1.toDouble() / num2
        return (divisionResult * 1000).toInt()
    }
}