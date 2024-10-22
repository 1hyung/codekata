class Solution {
    fun solution(arr: Array<IntArray>): IntArray {
        val result = IntArray(2) // 0의 개수와 1의 개수 저장 배열

        // 배열을 압축하는 함수
        fun compress(x: Int, y: Int, size: Int) {
            // 현재 구역의 첫 번째 값
            val initial = arr[x][y]
            var same = true

            // 현재 구역이 모두 같은 값인지 확인
            for (i in x until x + size) {
                for (j in y until y + size) {
                    if (arr[i][j] != initial) {
                        same = false
                        break
                    }
                }
                if (!same) break
            }

            // 만약 같은 값으로 이루어져 있으면 해당 값을 카운트
            if (same) {
                result[initial] += 1
            } else {
                // 그렇지 않으면 4등분하여 다시 압축 시도
                val newSize = size / 2
                compress(x, y, newSize)               // 왼쪽 위
                compress(x, y + newSize, newSize)     // 오른쪽 위
                compress(x + newSize, y, newSize)     // 왼쪽 아래
                compress(x + newSize, y + newSize, newSize) // 오른쪽 아래
            }
        }

        // 전체 배열을 처음부터 압축 시작
        compress(0, 0, arr.size)

        return result
    }
}