class Solution {
    fun solution(numbers: IntArray): IntArray {
        val resultSet = mutableSetOf<Int>() // 중복 제거를 위한 Set

        for (i in numbers.indices) {
            for (j in i + 1 until numbers.size) {
                resultSet.add(numbers[i] + numbers[j]) // 두 수의 합을 Set에 추가
            }
        }

        return resultSet.sorted().toIntArray() // 정렬 후 IntArray로 변환
    }
}