class Solution {
    val words = arrayOf('A', 'E', 'I', 'O', 'U')
    var answer = 0 
    var find = false 
    
    fun solution(word: String): Int {
        DFS("", word) 
        
        return answer 
    }
    
    fun DFS(string: String, word: String) {
        for (i in words) {
            if (find) break 
            
            val s = string + i 
            answer++ 
            
            if (s == word) find = true 
            else if (s.length != 5) DFS(s, word) 
        }
    }
}
