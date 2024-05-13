class Solution {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        var answer = 0

        lost.sort()
        reserve.sort()
        var lostList = lost.toMutableList()
        var reserveList = reserve.toMutableList()
        var removed = mutableListOf<Int>()
        lostList.forEach {
            if(reserveList.contains(it)) {
                removed.add(it)
            }
        }
        lostList.removeAll(removed)
        reserveList.removeAll(removed)

        for(i in lostList.indices) {
            for(j in reserveList.indices) {
                if(reserveList[j] == lostList[i] + 1 || reserveList[j] == lostList[i] - 1) {
                    reserveList.removeAt(j) 
                    ++ answer
                    break
                }
            }
        }

        return n - (lostList.size - answer) 
    }
}