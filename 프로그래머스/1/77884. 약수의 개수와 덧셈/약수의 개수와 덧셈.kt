class Solution {
    fun solution(left: Int, right: Int): Int {
        return (left..right).map { i -> if ((1..i).filter { i % it == 0 }.size % 2 == 0) i else -i }.sum()
    }
}