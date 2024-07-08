import kotlin.math.max
import kotlin.math.min

class Solution {
    fun solution(w: Int, h: Int): Long {
    val lw = w.toLong()
    val lh = h.toLong()

    var answer: Long = (lw * lh)


    return answer - (lw+lh- gcd(lw,lh))
    }
}
fun gcd(a: Long, b: Long): Long {
    var maximum = max(a, b)
    var minimum = min(a, b)

    if (minimum == 0.toLong()) {
        return max(a, b)
    } else {
        return gcd(minimum, maximum % minimum)
    }
}