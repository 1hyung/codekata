class Solution {
    fun solution(number: IntArray): Int {
        var count = 0 // 삼총사 개수 카운트
        
        for (i in 0 until number.size - 2) { // 1.첫 번째 숫자 선택
            for (j in i + 1 until number.size - 1) { // 2.두 번째 숫자 선택
                for (k in j + 1 until number.size) { // 3.세 번째 숫자 선택
                    if (number[i] + number[j] + number[k] == 0) { // 세 수의 합이 0인지 확인
                        count++ // 삼총사 개수 증가
                    }
                }
            }
        }
        
        return count // 결과 반환
    }
}