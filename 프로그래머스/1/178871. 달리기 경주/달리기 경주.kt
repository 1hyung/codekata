class Solution {
    fun solution(players: Array<String>, callings: Array<String>): Array<String> {
        // 선수 이름을 키로, 현재 등수를 값으로 저장하는 맵을 생성
        val positionMap = mutableMapOf<String, Int>()
        for (i in players.indices) {
            positionMap[players[i]] = i // 선수의 현재 등수를 저장
        }
        
        // 추월할 때마다 순서를 갱신
        for (name in callings) {
            val currentPosition = positionMap[name]!! // 추월할 선수의 현재 위치
            
            if (currentPosition > 0) { // 맨 앞 선수는 추월하지 않음
                // 앞에 있는 선수와 자리 바꾸기
                val previousPosition = currentPosition - 1
                val previousPlayer = players[previousPosition]

                // 선수 배열에서 자리 변경
                players[previousPosition] = name
                players[currentPosition] = previousPlayer

                // 맵에서도 선수들의 등수 갱신
                positionMap[name] = previousPosition
                positionMap[previousPlayer] = currentPosition
            }
        }
        
        return players // 경주가 끝난 후 최종 선수 배열 반환
    }
}
