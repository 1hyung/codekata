class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var maxWidth = 0
        var maxHeight = 0

        for (size in sizes) {
            val (w, h) = size
            // 각 명함을 회전시켜 가로가 항상 큰 값이 되도록 정렬
            val maxSide = maxOf(w, h)
            val minSide = minOf(w, h)

            // 최대 가로와 최대 세로 값을 찾습니다.
            maxWidth = maxOf(maxWidth, maxSide)
            maxHeight = maxOf(maxHeight, minSide)
        }

        // 최대 가로와 최대 세로를 곱한 값이 최소 지갑 크기입니다.
        return maxWidth * maxHeight
    }
}
