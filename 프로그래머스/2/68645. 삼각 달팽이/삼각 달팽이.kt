class Solution {
    fun solution(n: Int): IntArray {
        var top = 0
        var left = 0
        var bottom = n - 1
        var right = n - 1
        var num = 1
        var idx = 0
        val max = (n + 1) * n / 2
        val answer = IntArray(max)
        val arr = Array(n) { IntArray(it + 1) }

        while (num <= max) {
            for (i in top..bottom) arr[i][left] = num++
            if (num > max) break
            left++
            top++
            for (i in left..right) arr[bottom][i] = num++
            if (num > max) break
            bottom--
            right--
            idx = right
            for (i in bottom downTo top) arr[i][idx--] = num++
            if (num > max) break
            right--
            top++
        }

        idx = 0
        arr.forEach { row -> row.forEach { answer[idx++] = it } }

        return answer
    }
}