class Solution {
    fun solution(a: Int, b: Int): Long {
        val start = minOf(a, b) // a와 b 중 작은 값을 시작 값으로 설정
        val end = maxOf(a, b)   // a와 b 중 큰 값을 끝 값으로 설정
        val count = end - start + 1 // 범위 내 항의 개수 계산 (끝 - 시작 + 1)

        return (start.toLong() + end.toLong()) * count / 2
        // (시작 값 + 끝 값) * 항의 개수 / 2 → 등차수열의 합 공식
        // Int 범위 초과를 방지하기 위해 Long으로 변환 후 계산
    }
}