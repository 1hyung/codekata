class Solution {
    fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
        // 신고 정보를 담을 Map을 생성
        val reportMap = mutableMapOf<String, MutableSet<String>>()
        // 결과 메일 수를 저장할 Map을 생성
        val mailCount = mutableMapOf<String, Int>().apply {
            id_list.forEach { this[it] = 0 }
        }

        // 신고 내역을 처리 (중복 신고 방지 위해 Set 사용)
        for (r in report) {
            val (from, to) = r.split(" ")
            reportMap.getOrPut(to) { mutableSetOf() }.add(from)
        }

        // 각 유저가 신고된 횟수를 확인하여 k번 이상이면 신고한 사람에게 메일 발송
        for ((reportedUser, reporters) in reportMap) {
            if (reporters.size >= k) {
                reporters.forEach { mailCount[it] = mailCount.getValue(it) + 1 }
            }
        }

        // id_list 순서대로 메일 발송 횟수를 배열로 변환
        return id_list.map { mailCount[it] ?: 0 }.toIntArray()
    }
}
