class Solution {
    fun solution(k: Int, tangerine: IntArray): Int {
        val maxTangerineSize = tangerine.maxOrNull() ?: 0
        val countArr = IntArray(maxTangerineSize + 1)
        
        tangerine.forEach { countArr[it]++ }
        
        countArr.sortDescending()
        
        var rest = k
        var ans = 0
        
        for (quantity in countArr) {
            if (rest <= 0) break
            
            if (quantity > 0) {
                ans++
                rest -= quantity
            }
        }
        
        return ans
    }
}