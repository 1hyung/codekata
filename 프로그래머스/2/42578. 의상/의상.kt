class Solution {
    fun solution(clothes: Array<Array<String>>): Int {
        val hashMap: HashMap<String, Int> = HashMap()
        
        for (cloth in clothes) {
            hashMap[cloth[1]] = hashMap.getOrDefault(cloth[1], 0) + 1
        }
        
        return hashMap.values.fold(1) { total, num -> total * (num + 1) } - 1
    }
}
