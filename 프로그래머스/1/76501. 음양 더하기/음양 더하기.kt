class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int =
        absolutes.mapIndexed { index, value -> // 인덱스와 값을 함께 사용
            if (signs[index]) value else -value // 양수/음수 처리
        }.sum() // 합계 계산
}