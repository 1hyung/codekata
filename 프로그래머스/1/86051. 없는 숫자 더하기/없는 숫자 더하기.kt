class Solution {
    fun solution(numbers: IntArray): Int {
        // 0부터 9까지의 모든 숫자를 포함하는 집합을 생성
        val fullSet = (0..9).toSet()
        
        // 주어진 numbers 배열을 집합으로 변환
        val numbersSet = numbers.toSet()
        
        // 0부터 9까지의 집합에서 numbers 집합을 뺀 후, 남은 숫자들의 합을 반환
        return fullSet.subtract(numbersSet).sum()
    }
}
