class Solution {
    fun solution(n: Long): Long {
        var answer: Long = 0
        
        for(x:Long in 1..n){
            if(x*x == n) return (x+1)*(x+1)
        }
        return -1
    }
}