class Solution {

    fun isPrime(num: Long): Int {
        if (num <= 1) return 0

        for (i in 2..Math.sqrt(num.toDouble()).toLong()) {
            if (num % i == 0L) return 0 
        }
        return 1 
    }

    fun changeNum(n: Int, k: Int): String {
        val strBuilder = StringBuffer() 
        var num = n 
        while (num != 0) {
            strBuilder.append(num % k) 
            num /= k 
        }
        return strBuilder.reverse().toString() 
    }

    fun solution(n: Int, k: Int): Int {
        var answer = 0 

        var num = 0L 
        changeNum(n, k).apply {
            for (ch in this) {
                if (ch == '0') {
                    answer += isPrime(num)
                    num = 0 
                } else {
                    num = num * 10 + Character.getNumericValue(ch) 
                }
            }
        }

        answer += isPrime(num)

        return answer 
    }
}
