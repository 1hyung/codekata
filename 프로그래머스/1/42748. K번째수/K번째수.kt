class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        return commands.map { (i, j, k) ->
            array.slice(i - 1 until j).sorted()[k - 1] // 부분 배열 추출 → 정렬 → k번째 원소 반환
        }.toIntArray() // 결과를 IntArray로 변환
    }
}