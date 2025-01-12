class Solution {
    // 작업을 몇 번이나 반복해야 하는지 반환하는 함수
    fun solution(num: Int): Int {
        var count = 0 // 작업 횟수
        var current = num.toLong() // 정수형 overflow 방지를 위해 Long 사용
        
        while (current != 1L) { // 1이 될 때까지 반복
            if (count == 500) return -1 // 500번 이상 반복 시 -1 반환
            current = if (current % 2 == 0L) current / 2 else current * 3 + 1 // 짝수 / 홀수 조건 처리
            count ++ // 작업 횟수 증가
            
        }
        return count // 작업 횟수 반환 
    }
}