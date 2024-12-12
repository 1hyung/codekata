class Solution {
    fun solution(a: IntArray): Int {
        val n = a.size

        if (n <= 2) return n // 길이가 2 이하일 경우 모두 남길 수 있음

        // 왼쪽 최소값 배열 계산
        val leftMin = IntArray(n)
        leftMin[0] = a[0]
        for (i in 1 until n) {
            leftMin[i] = minOf(leftMin[i - 1], a[i])
        }

        // 오른쪽 최소값 배열 계산
        val rightMin = IntArray(n)
        rightMin[n - 1] = a[n - 1]
        for (i in n - 2 downTo 0) {
            rightMin[i] = minOf(rightMin[i + 1], a[i])
        }

        // 최후까지 남을 수 있는 풍선의 개수 계산
        var count = 0
        for (i in 0 until n) {
            if (a[i] <= leftMin[i] || a[i] <= rightMin[i]) {
                count++
            }
        }

        return count
    }
}