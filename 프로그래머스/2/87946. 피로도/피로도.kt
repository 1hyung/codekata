class Solution {

    private lateinit var visited: BooleanArray
    private var maxCount = 0

    fun solution(k: Int, dungeons: Array<IntArray>): Int {
        visited = BooleanArray(dungeons.size)
        dfs(k, 0, dungeons)
        return maxCount
    }

    private fun dfs(k: Int, count: Int, dungeons: Array<IntArray>) {
        if (count > maxCount) {
            maxCount = count
        }

        for (i in dungeons.indices) {
            if (!visited[i] && dungeons[i][0] <= k) {
                visited[i] = true
                dfs(k - dungeons[i][1], count + 1, dungeons)
                visited[i] = false
            }
        }
    }
}
