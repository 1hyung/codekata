class Solution {
    fun solution(s: String): Int {
        val nums = listOf(
            "zero", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine"
        )
        var result = s
        for (i in nums.indices) {
            result = result.replace(nums[i], i.toString()) // 영단어를 숫자로 치환
        }
        return result.toInt() // 최종적으로 숫자 변환
    }
}