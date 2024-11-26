class Solution {
    fun solution(cap: Int, n: Int, deliveries: IntArray, pickups: IntArray): Long {
        var totalDistance = 0L
        var deliveryRemaining = 0
        var pickupRemaining = 0

        for (i in n - 1 downTo 0) {
            deliveryRemaining += deliveries[i]
            pickupRemaining += pickups[i]

            // 방문이 필요한 경우 거리 추가
            while (deliveryRemaining > 0 || pickupRemaining > 0) {
                totalDistance += (i + 1) * 2L // 왕복 거리 추가

                // 트럭 용량만큼 배달 및 수거 처리
                deliveryRemaining -= cap
                pickupRemaining -= cap
            }
        }

        return totalDistance
    }
}