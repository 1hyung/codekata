class Solution {
    private var answer = 0
    private val answerSet = mutableSetOf<Int>()

    fun solution(numbers: String): Int {
        val cards = numbers.toCharArray()
        cards.forEachIndexed { index, c ->
            addNumber(c.toString(), cards.filterIndexed { i, _ -> index != i })
        }

        answerSet.forEach {
            if (isPrime(it)) answer++
        }

        return answer
    }

    private fun addNumber(number: String, cards: List<Char>) {
        answerSet.add(number.toInt())
        if (cards.isEmpty()) return

        cards.forEachIndexed { index, c ->
            addNumber("$number$c", cards.filterIndexed { i, _ -> index != i })
        }
    }

    private fun isPrime(n: Int): Boolean = n > 1 && (2..Math.sqrt(n.toDouble()).toInt()).none { n % it == 0 }
}
