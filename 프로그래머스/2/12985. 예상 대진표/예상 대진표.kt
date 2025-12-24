// 예상 대진표
class Solution {
    fun solution(n: Int, a: Int, b: Int): Int {
        var round = 0  // 현재 라운드를 저장
        var playerA = a  // A 참가자 번호
        var playerB = b  // B 참가자 번호

        // 두 참가자가 같은 번호를 가질 때까지 반복
        while (playerA != playerB) {
            // 라운드 수 증가
            round++
            
            // 참가자 번호 갱신: 다음 라운드에서 이기는 사람의 번호는 (번호 + 1) / 2
            playerA = (playerA + 1) / 2
            playerB = (playerB + 1) / 2
        }

        return round  // 두 참가자가 만나게 된 라운드 반환
    }
}
