class Solution {
    fun solution(cards: IntArray): Int {
        val visited = BooleanArray(cards.size) // 상자 열림 여부를 저장하는 배열
        val groupSizes = mutableListOf<Int>() // 각 그룹의 크기를 저장할 리스트

        // 각 상자에서 출발해 그룹을 만듭니다.
        for (i in cards.indices) {
            if (!visited[i]) { // 상자가 아직 열리지 않았다면
                var groupSize = 0
                var currentIndex = i
                
                // 상자를 열어 그룹을 형성합니다.
                while (!visited[currentIndex]) {
                    visited[currentIndex] = true // 상자를 열었다고 표시
                    groupSize++ // 그룹의 크기를 증가
                    currentIndex = cards[currentIndex] - 1 // 다음 상자의 인덱스로 이동
                }
                
                groupSizes.add(groupSize) // 완성된 그룹의 크기 저장
            }
        }

        // 그룹 크기들을 내림차순으로 정렬합니다.
        groupSizes.sortDescending()
        
        // 가장 큰 두 그룹이 없다면 0을 반환
        return if (groupSizes.size < 2) 0 else groupSizes[0] * groupSizes[1]
    }
}