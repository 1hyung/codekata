class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var sum = 0 // 결과 합계를 저장할 변수

        for (i in absolutes.indices) {
            if (signs[i]) {
                sum += absolutes[i] // signs[i]가 참이면 양수로 더함
            } else {
                sum -= absolutes[i] // signs[i]가 거짓이면 음수로 더함
            }
        }

        return sum // 최종 합계 반환
    }
}
