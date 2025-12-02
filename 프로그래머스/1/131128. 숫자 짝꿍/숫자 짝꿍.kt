// 숫자 짝꿍
class Solution {
    fun solution(X: String, Y: String): String {
        // 숫자 0부터 9까지 각각의 개수를 저장할 배열
        val countX = IntArray(10)
        val countY = IntArray(10)

        // X의 각 숫자의 개수를 카운트
        for (char in X) {
            countX[char - '0']++
        }

        // Y의 각 숫자의 개수를 카운트
        for (char in Y) {
            countY[char - '0']++
        }

        // 공통된 숫자를 찾고, 내림차순으로 문자열로 결과를 만들기 위한 변수
        val result = StringBuilder()

        // 9부터 0까지 확인하여 큰 숫자부터 추가
        for (i in 9 downTo 0) {
            val commonCount = minOf(countX[i], countY[i])  // X와 Y에서 공통으로 나타난 횟수의 최소값
            repeat(commonCount) {
                result.append(i)  // 공통 숫자를 추가
            }
        }

        // 공통 숫자가 없으면 -1을 반환
        if (result.isEmpty()) {
            return "-1"
        }

        // 공통 숫자가 0으로만 이루어져 있으면 "0"을 반환
        if (result.toString() == "0".repeat(result.length)) {
            return "0"
        }

        return result.toString()
    }
}
