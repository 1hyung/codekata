// 정수 제곱근 판별 
import kotlin.math.sqrt // sqrt() 수학 함수 import

class Solution {
    fun solution(n: Long): Long {

        val root = sqrt(n.toDouble()) // sqrt는 Double 타입이므로 toDouble()로 변환
        
        return if (root % 1 == 0.0) { 
            val next = (root + 1).toLong() // root는 Double → Long으로 변환 (리턴 타입 맞추기)
            next * next // 제곱근이 정수라면 (x + 1)^2 계산
        } else -1 // 제곱근이 정수가 아니면 -1 리턴
    }
}