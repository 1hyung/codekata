class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        return recursion(a, b, n)
    }
    
    private fun recursion(a: Int, b: Int, n: Int): Int {
        if (n / a == 0) return 0
        return (n / a) * b + recursion(a, b, (n / a) * b + (n % a))
    }
}