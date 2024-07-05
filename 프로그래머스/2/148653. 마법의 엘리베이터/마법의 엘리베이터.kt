class Solution {
    fun solution(storey: Int): Int {
        return solve(storey)
    }

    private fun solve(storey: Int): Int {
        var tempStorey = storey
        var cnt = 0
        
        while (tempStorey > 0) {
            val ext = tempStorey % 10
            tempStorey /= 10
            
            cnt += when {
                ext == 5 -> {
                    if (tempStorey % 10 >= 5) {
                        tempStorey++
                        10 - ext
                    } else {
                        ext
                    }
                }
                ext > 5 -> {
                    tempStorey++
                    10 - ext
                }
                else -> {
                    ext
                }
            }
        }
        return cnt
    }
}
