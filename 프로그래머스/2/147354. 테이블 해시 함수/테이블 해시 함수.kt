class Solution {
    fun solution(data: Array<IntArray>, col: Int, row_begin: Int, row_end: Int): Int {
        // col번째 컬럼 기준 오름차순 정렬, 값이 동일하면 첫 번째 컬럼 기준 내림차순 정렬
        val sortedData = data.sortedWith(compareBy({ it[col - 1] }, { -it[0] }))

        var hashValue = 0 // 해시 값을 저장할 변수

        // row_begin부터 row_end까지의 각 행에 대해 S_i 값을 계산하여 XOR
        for (i in row_begin..row_end) {
            // S_i 계산: 각 컬럼의 값을 i로 나눈 나머지들의 합
            val s_i = sortedData[i - 1].sumOf { it % i }
            // 누적 XOR 계산
            hashValue = hashValue xor s_i
        }

        return hashValue
    }
}