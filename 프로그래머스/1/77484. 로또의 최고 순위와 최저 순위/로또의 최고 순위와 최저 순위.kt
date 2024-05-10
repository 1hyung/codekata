class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        
        var zeros = 0 
        var correct = 0 
        for(n in lottos){
            if(n == 0) zeros++
            else if(win_nums.contains(n)) correct++
        }
        
            answer += when(zeros + correct){
            6-> 1
            5-> 2
            4-> 3
            3-> 4 
            2-> 5
            else -> 6
        } 
 
        answer += when(correct){
            6-> 1
            5-> 2
            4-> 3
            3-> 4 
            2-> 5
            else -> 6
        }
        return answer
    }
}