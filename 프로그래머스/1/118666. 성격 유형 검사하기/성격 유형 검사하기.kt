class Solution {
    fun solution(survey: Array<String>, choices: IntArray): String {
        val scores = mutableMapOf<Char, Int>('R' to 0, 'T' to 0, 'C' to 0, 'F' to 0, 'J' to 0, 'M' to 0, 'A' to 0, 'N' to 0)

        for (i in survey.indices) {
            val (a, b) = survey[i][0] to survey[i][1]
            when (choices[i]) {
                1 -> scores[a] = scores.getOrDefault(a, 0) + 3
                2 -> scores[a] = scores.getOrDefault(a, 0) + 2
                3 -> scores[a] = scores.getOrDefault(a, 0) + 1
                5 -> scores[b] = scores.getOrDefault(b, 0) + 1
                6 -> scores[b] = scores.getOrDefault(b, 0) + 2
                7 -> scores[b] = scores.getOrDefault(b, 0) + 3
            }
        }

        val result = StringBuilder()
        result.append(if (scores['R']!! >= scores['T']!!) 'R' else 'T')
        result.append(if (scores['C']!! >= scores['F']!!) 'C' else 'F')
        result.append(if (scores['J']!! >= scores['M']!!) 'J' else 'M')
        result.append(if (scores['A']!! >= scores['N']!!) 'A' else 'N')

        return result.toString()
    }
}