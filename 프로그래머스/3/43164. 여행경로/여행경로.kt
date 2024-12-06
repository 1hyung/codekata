class Solution {
    fun solution(tickets: Array<Array<String>>): Array<String> {
        val graph = tickets.groupBy({ it[0] }, { it[1] }).mapValues { it.value.sorted().toMutableList() }
        val route = mutableListOf<String>()

        fun dfs(airport: String) {
            while (graph[airport]?.isNotEmpty() == true) {
                val next = graph[airport]?.removeAt(0)
                next?.let { dfs(it) }
            }
            route.add(airport)
        }

        dfs("ICN")
        return route.reversed().toTypedArray()
    }
}