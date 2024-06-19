class Solution {
    fun solution(numbers: LongArray): LongArray {
        return numbers.map {
            if (it % 2 == 0L) { 
                it + 1 
            } else { 
                val binary = it.toString(2).reversed() + "0" 
                val index = binary.indexOf('0') 
                val modifiedBinary = binary.substring(0, index - 1) + "01" + binary.substring(index + 1)
                modifiedBinary.reversed().toLong(2) 
            }
        }.toLongArray() 
    }
}