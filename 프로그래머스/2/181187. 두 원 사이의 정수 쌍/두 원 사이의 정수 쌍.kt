class Solution {
    fun solution(r1: Int, r2: Int): Long {
        var count: Long = 0

        for (x in 0..r2) {
            // r2 범위 내 최대 y 값
            val maxYForR2 = Math.floor(Math.sqrt((r2.toLong() * r2 - x.toLong() * x).toDouble())).toLong()
            // r1 범위 내 최소 y 값 (x가 r1보다 작은 경우에만 적용)
            val minYForR1 = if (x < r1) {
                Math.ceil(Math.sqrt((r1.toLong() * r1 - x.toLong() * x).toDouble())).toLong()
            } else {
                0
            }

            // 두 원 사이에 있는 y 값의 개수 추가
            count += (maxYForR2 - minYForR1 + 1)
        }

        return count * 4 - (r2 - r1 + 1) * 4 // 중복된 경계 점 제외
    }
}