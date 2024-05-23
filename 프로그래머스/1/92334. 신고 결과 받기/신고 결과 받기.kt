class Solution {
    fun solution(idList: Array<String>, report: Array<String>, k: Int): IntArray {

        val reportCountMap = mutableMapOf<String, Int>()
        report.distinct().forEach {
            val reportedUser = it.split(' ')[1]
            reportCountMap[reportedUser] = reportCountMap.getOrDefault(reportedUser, 0) + 1
        }

        val suspendedUsers = reportCountMap.filterValues { it >= k }

        val notificationsMap = mutableMapOf<String, Int>()
        idList.forEach {
            notificationsMap[it] = 0
        }

        report.distinct().forEach {
            val reporter = it.split(' ')[0]
            val reportedUser = it.split(' ')[1]
            if (suspendedUsers.contains(reportedUser)) {
                notificationsMap[reporter] = notificationsMap.getOrDefault(reporter, 0) + 1
            }
        }

        return notificationsMap.values.toIntArray()
    }
}
