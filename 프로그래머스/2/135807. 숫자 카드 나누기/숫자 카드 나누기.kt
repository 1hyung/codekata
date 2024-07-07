class Solution {
    fun solution(arrayA: IntArray, arrayB: IntArray): Int {
        var answer = 0
        var gcdA = arrayA[0]
        var gcdB = arrayB[0]

        val size = arrayA.size
        for (i in 1 until size) {
            gcdA = gcd(gcdA, arrayA[i])
            gcdB = gcd(gcdB, arrayB[i])
        }

        if (isDivisible(arrayB, gcdA)) {
            answer = maxOf(answer, gcdA)
        }

        if (isDivisible(arrayA, gcdB)) {
            answer = maxOf(answer, gcdB)
        }

        return answer
    } 

    private fun gcd(a: Int, b: Int): Int {
        if (b == 0) return a
        return gcd(b, a % b)
    } 

    private fun isDivisible(array: IntArray, target: Int): Boolean {
        array.forEach {
            if (it % target == 0) {
                return false
            }
        }
        return true
    }
}