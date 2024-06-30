class Solution {
    fun min(a: Int, b: Int): Int {
        return if (a >= b) b else a
    }
    
    fun solution(rows: Int, columns: Int, queries: Array<IntArray>): IntArray {
        var answer = intArrayOf()
        val array = Array(rows) { Array(columns) { 0 } }
        var cnt = 1
        
        for (row in 0 until rows) {
            for (col in 0 until columns) {
                array[row][col] = cnt
                cnt += 1
            }
        }
        
        for (query in queries) {
            val srt = Pair(query[0] - 1, query[1] - 1) 
            val dst = Pair(query[2] - 1, query[3] - 1) 
            val element = arrayListOf<Int>()
            var minValue = Int.MAX_VALUE
            
            for (j in srt.second until dst.second) {
                element.add(array[srt.first][j])
                minValue = min(minValue, array[srt.first][j])
            }
            
            for (j in srt.first until dst.first) {
                element.add(array[j][dst.second])
                minValue = min(minValue, array[j][dst.second])
            }
            
            for (j in dst.second downTo srt.second + 1) {
                element.add(array[dst.first][j])
                minValue = min(minValue, array[dst.first][j])
            }
            
            for (j in dst.first downTo srt.first + 1) {
                element.add(array[j][srt.second])
                minValue = min(minValue, array[j][srt.second])
            }
            
            answer = answer.plus(minValue)
            
            val temp = element.removeAt(element.size - 1)
            element.add(0, temp)
            
            var index = 0
            for (j in srt.second until dst.second) {
                array[srt.first][j] = element[index++]
            }
            
            for (j in srt.first until dst.first) {
                array[j][dst.second] = element[index++]
            }
            
            for (j in dst.second downTo srt.second + 1) {
                array[dst.first][j] = element[index++]
            }
            
            for (j in dst.first downTo srt.first + 1) {
                array[j][srt.second] = element[index++]
            }
        }
        return answer
    }
}