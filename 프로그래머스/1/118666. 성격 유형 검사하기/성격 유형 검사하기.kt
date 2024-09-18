class Solution {
    fun solution(survey: Array<String>, choices: IntArray): String {
        val types = mutableMapOf(
            'R' to 0, 'T' to 0,
            'C' to 0, 'F' to 0,
            'J' to 0, 'M' to 0,
            'A' to 0, 'N' to 0
        )

        for (i in survey.indices) {
            val (disagreeType, agreeType) = survey[i].toCharArray()
            val choice = choices[i]

            when (choice) {
                1 -> types[disagreeType] = types[disagreeType]!! + 3
                2 -> types[disagreeType] = types[disagreeType]!! + 2
                3 -> types[disagreeType] = types[disagreeType]!! + 1
                5 -> types[agreeType] = types[agreeType]!! + 1
                6 -> types[agreeType] = types[agreeType]!! + 2
                7 -> types[agreeType] = types[agreeType]!! + 3
            }
        }

        val result = StringBuilder()
        result.append(if (types['R']!! >= types['T']!!) "R" else "T")
        result.append(if (types['C']!! >= types['F']!!) "C" else "F")
        result.append(if (types['J']!! >= types['M']!!) "J" else "M")
        result.append(if (types['A']!! >= types['N']!!) "A" else "N")

        return result.toString()
    }
}
