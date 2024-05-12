class Solution {
    fun solution(X: String, Y: String): String {
        val countsX = X.groupingBy { it }.eachCount()
        val countsY = Y.groupingBy { it }.eachCount()
        
        var result = StringBuilder()
        var zero = true
        
        for (digit in '9' downTo '1') {
            val minCount = minOf(countsX.getOrDefault(digit, 0), countsY.getOrDefault(digit, 0))
            if(minCount>0){
                zero = false
                result.append(digit.toString().repeat(minCount))
            }
        }
        val zeroCount = minOf(countsX.getOrDefault('0', 0), countsY.getOrDefault('0', 0))
        if (zeroCount > 0 && !zero) {
            result.append('0'.toString().repeat(zeroCount))
        } else if (zeroCount > 0) {
            result.append('0')
        }
        return result.toString().ifEmpty { "-1" }
    }
}