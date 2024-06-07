class Solution {
    fun solution(want: Array<String>, number: IntArray, discount: Array<String>): Int {
        var answer = 0
        val hashMap = mutableMapOf<String, Int>()

        want.forEachIndexed { index, value ->
            hashMap[value] = number[index]
        }

        for (i in 0..discount.size - 10) {
            val subList = discount.sliceArray(i until i + 10)
            val countMap = subList.groupingBy { it }.eachCount()

            val check = hashMap.all { (key: String, value: Int) -> 
                countMap.getOrDefault(key, 0) >= value 
            }

            if (check) {
                answer++
            }
        }

        return answer
    }
}
