class Solution {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        var answer = 0

		// MutalbeList로 변환 후 서로 갖고있는 요소 삭제
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

		// 순환 시작
        for(i in lostList.indices) {
            for(j in reserveList.indices) {
                if(reserveList[j] == lostList[i] + 1 || reserveList[j] == lostList[i] - 1) {
                    reserveList.removeAt(j) // 이미 빌려준 사람은 리스트에서 삭제
                    ++ answer
                    break
                }
            }
        }

        return n - (lostList.size - answer) // 전체 인원 - (빌리기 전 잃어버린 사람 수 - 빌린 사람)
    }
}