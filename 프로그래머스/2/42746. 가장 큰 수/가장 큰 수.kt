class Solution {
    fun solution(numbers: IntArray): String {
        val temp = numbers.map { it.toString() }.sortedWith(Comparator { o1, o2 ->
            (o2 + o1).compareTo(o1 + o2)
        })

        if (temp[0] == "0") {
            return "0"
        }

        return temp.joinToString("")
    }
}
