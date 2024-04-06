class Solution {
    fun solution(phone_number: String): String {
        var answer = ""    
        var length = phone_number.length - 4
        
        for(i in 1..length) {
            answer += "*"
        }
        
        answer = answer + phone_number.substring(length, length + 4)  
        
        return answer
    }
}