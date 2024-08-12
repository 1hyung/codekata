class Solution {
    fun solution(n: Int): String {
        return (1..n).map { if (it % 2 != 0) "수" else "박" }.joinToString("")
    }
}
