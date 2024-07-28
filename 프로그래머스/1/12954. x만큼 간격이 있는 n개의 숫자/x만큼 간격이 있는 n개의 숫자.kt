class Solution {
    fun solution(x: Int, n: Int): LongArray {
        // 길이가 n인 LongArray 생성
        val answer = LongArray(n)
        
        // x부터 시작해서 x씩 증가하는 숫자를 n개 추가
        for (i in 0 until n) {
            answer[i] = x.toLong() * (i + 1)
        }
        
        return answer
    }
}