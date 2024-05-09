import kotlin.math.*
class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int {
        var answer: Int = 0
        var attackList = mutableListOf<Int>()
        for(i in 1 .. number){
            var count = 0
            var end = sqrt(i.toDouble()).toInt()
            for(j in 1 .. end){
                if(j * j == i){
                    count++
                } else if(i % j == 0){
                    count += 2
                }
            }
            if(count > limit){
               attackList.add(power) 
            } else {
                attackList.add(count) 
            }
        }
        answer = attackList.sum()
        return answer
    }
}