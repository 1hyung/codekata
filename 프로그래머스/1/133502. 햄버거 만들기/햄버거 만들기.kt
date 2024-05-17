class Solution {
    fun solution(ingredient: IntArray): Int {
        val st = mutableListOf<Int>()
    
        var answer: Int = 0
        for (ing in ingredient) {
            st.add(ing)
            
            if (st.size >= 4) {
                val peek1 = st.removeAt(st.size - 1)
                val peek2 = st.removeAt(st.size - 1)
                val peek3 = st.removeAt(st.size - 1)
                val peek4 = st.removeAt(st.size - 1)
                
                if ((peek4 == 1) && (peek3 == 2) && (peek2 == 3) && (peek1 == 1)) {
                    answer++
                } else {
                    st.add(peek4)
                    st.add(peek3)
                    st.add(peek2)
                    st.add(peek1)
                }
            }
        }
        return answer
    }
}
