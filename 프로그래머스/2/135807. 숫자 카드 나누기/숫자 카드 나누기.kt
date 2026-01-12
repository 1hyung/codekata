// 숫자 카드 나누기
class Solution {
    // 최대 공약수 함수
    private fun gcd(a: Int, b: Int): Int {
        return if (b == 0) a else gcd(b, a % b)
    }

    // 배열의 최대 공약수 구하는 함수
    private fun gcdOfArray(arr: IntArray): Int {
        var result = arr[0]
        for (num in arr) {
            result = gcd(result, num)
            if (result == 1) return 1 // 더 이상 줄일 수 없는 경우
        }
        return result
    }

    // arrayA의 최대 공약수가 arrayB의 모든 원소를 나누지 못하는지 검사
    private fun cannotDivideAll(divisor: Int, array: IntArray): Boolean {
        for (num in array) {
            if (num % divisor == 0) return false
        }
        return true
    }

    fun solution(arrayA: IntArray, arrayB: IntArray): Int {
        // 각각의 배열의 최대 공약수
        val gcdA = gcdOfArray(arrayA)
        val gcdB = gcdOfArray(arrayB)

        var result = 0

        // 조건을 만족하는지 확인하고 최대값 갱신
        if (cannotDivideAll(gcdA, arrayB)) {
            result = maxOf(result, gcdA)
        }
        if (cannotDivideAll(gcdB, arrayA)) {
            result = maxOf(result, gcdB)
        }

        return result
    }
}