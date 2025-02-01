class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var maxWidth = 0  // 가장 긴 가로 길이
        var maxHeight = 0 // 가장 긴 세로 길이

        for (size in sizes) {
            val w = size[0] // 명함의 가로 길이
            val h = size[1] // 명함의 세로 길이

            val (big, small) = if (w > h) w to h else h to w // 큰 값을 가로, 작은 값을 세로로 설정

            maxWidth = maxOf(maxWidth, big) // 현재까지의 최대 가로 길이 업데이트
            maxHeight = maxOf(maxHeight, small) // 현재까지의 최대 세로 길이 업데이트
        }

        return maxWidth * maxHeight // 최소한의 지갑 크기 반환
    }
}