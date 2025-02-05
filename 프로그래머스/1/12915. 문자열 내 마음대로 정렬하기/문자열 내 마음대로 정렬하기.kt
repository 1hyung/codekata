class Solution {
    fun solution(strings: Array<String>, n: Int): Array<String> {
        return strings.sortedWith(Comparator { a, b ->
            if (a[n] == b[n]) a.compareTo(b) // n번째 문자가 같다면 사전순 정렬
            else a[n].compareTo(b[n]) // n번째 문자를 기준으로 정렬
        }).toTypedArray()
    }
}