class Solution {
    fun solution(n: Int, left: Long, right: Long): IntArray {
        // 결과 배열을 초기화합니다. 크기는 right - left + 1로 설정합니다.
        val result = IntArray((right - left + 1).toInt())

        // left부터 right까지 각 인덱스에 대해 반복합니다.
        for (i in left..right) {
            // i번째 요소가 위치하는 2차원 배열에서의 row와 col 계산
            val row = (i / n).toInt() // 행 번호 계산
            val col = (i % n).toInt() // 열 번호 계산

            // 해당 (row, col) 위치의 값은 max(row, col) + 1
            result[(i - left).toInt()] = maxOf(row, col) + 1
        }

        // 결과 배열을 반환합니다.
        return result
    }
}
