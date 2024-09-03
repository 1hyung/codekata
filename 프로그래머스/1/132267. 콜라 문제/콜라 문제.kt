class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        var totalCokes = 0
        var emptyBottles = n

        while (emptyBottles >= a) {
            val newCokes = (emptyBottles / a) * b
            totalCokes += newCokes
            emptyBottles = (emptyBottles % a) + newCokes
        }

        return totalCokes
    }
}
