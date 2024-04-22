class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var max = ArrayList<Int>()
        var min = ArrayList<Int>()

        for (i in sizes) {
            if (i[0] >= i[1]) {
                max.add(i[0])
                min.add(i[1])
            } else {
                max.add(i[1])
                min.add(i[0])
            }
        }
        return max.maxOrNull()!! * min.maxOrNull()!!
    }
}