class Solution {
    fun solution(players: Array<String>, callings: Array<String>): Array<String> {
        val answer = Array(players.size) { "" }
        val rankMap = mutableMapOf<Int, String>() 
        val playerMap = mutableMapOf<String, Int>() 

        for (i in players.indices) {
            rankMap[i] = players[i]
            playerMap[players[i]] = i
        }

        callings.forEach { calledPlayer ->
            val calledPlayerRank = playerMap[calledPlayer]!! - 1

            val overtakenPlayer = rankMap[calledPlayerRank]!!
            val overtakenPlayerRank = calledPlayerRank + 1

            playerMap[calledPlayer] = calledPlayerRank
            rankMap[calledPlayerRank] = calledPlayer

            playerMap[overtakenPlayer] = overtakenPlayerRank
            rankMap[overtakenPlayerRank] = overtakenPlayer
        }

        rankMap.forEach { (rank, player) ->
            answer[rank] = player
        }

        return answer
    }
}
