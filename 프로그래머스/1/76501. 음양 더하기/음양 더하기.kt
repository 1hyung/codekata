class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int =
        absolutes.mapIndexed { index, value -> // index와 value를 함께 사용
            if (signs[index]) value else -value // signs 값에 따라 양수/음수 변환
        }.sum() // 변환된 값들을 합산
}
