class Solution {
    fun solution(citations: IntArray): Int {
        val sortedCitations = citations.sortedDescending()
        
        for (i in sortedCitations.indices) {
            if (sortedCitations[i] <= i) {
                return i
            }
        }
        
        return sortedCitations.size
    }
}
