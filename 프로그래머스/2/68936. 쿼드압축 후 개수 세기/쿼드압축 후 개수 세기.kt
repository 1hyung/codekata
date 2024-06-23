class Solution {
    fun solution(arr: Array<IntArray>): IntArray {
        val zeroOne = intArrayOf(0, 0)  

        fun dfs(r: Int, c: Int, sz: Int) {
            val zipable = canZip(arr, r, c, sz)  
            if (zipable != -1) {
                zeroOne[zipable]++  
                return
            }

            val halfSize = sz / 2
            dfs(r, c, halfSize)
            dfs(r, c + halfSize, halfSize)
            dfs(r + halfSize, c, halfSize)
            dfs(r + halfSize, c + halfSize, halfSize)
        }

        dfs(0, 0, arr.size)  

        return zeroOne  
    }

    fun canZip(arr: Array<IntArray>, r: Int, c: Int, sz: Int): Int {
        val start = arr[r][c]  
        for (i in r until r + sz) {
            for (j in c until c + sz) {
                if (arr[i][j] != start) return -1 
            }
        }
        return start  
    }
}