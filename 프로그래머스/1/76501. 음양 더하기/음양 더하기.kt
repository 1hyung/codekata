// 음양 더하기 

class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int =
        absolutes.mapIndexed { index, value ->  // 인덱스와 값 접근
            if (signs[index]) value else -value // 부호에 따라 음수 처리
        }.sum() // 전체 합산
}
