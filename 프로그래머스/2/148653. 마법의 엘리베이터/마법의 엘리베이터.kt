// 마법의 엘리베이터
class Solution {
    fun solution(storey: Int): Int {
        var remaining = storey
        var moves = 0
        
        while (remaining > 0) {
            val lastDigit = remaining % 10 // 현재 자릿수의 값
            val nextDigit = (remaining / 10) % 10 // 다음 자릿수의 값
            
            // 올림하는 게 더 유리한지 확인
            if (lastDigit > 5 || (lastDigit == 5 && nextDigit >= 5)) {
                moves += 10 - lastDigit
                remaining += 10 - lastDigit // 윗자리로 올림 처리
            } else {
                moves += lastDigit // 내림으로 해결
            }
            
            remaining /= 10 // 다음 자릿수로 이동
        }
        
        return moves
    }
}