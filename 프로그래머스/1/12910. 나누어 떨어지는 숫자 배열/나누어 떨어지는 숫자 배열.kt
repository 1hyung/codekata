class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        val result = mutableListOf<Int>() // 결과를 저장할 리스트
        
        for (num in arr) { // 배열을 순회하며 divisor로 나누어 떨어지는 값 찾기
            if (num % divisor == 0) {
                result.add(num) // 리스트에 추가
            }
        }
        
        return if (result.isNotEmpty()) result.sorted().toIntArray() // 오름차순 정렬 후 반환
               else intArrayOf(-1) // 빈 리스트라면 [-1] 반환
    }
}