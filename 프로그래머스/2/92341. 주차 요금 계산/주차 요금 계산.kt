class Solution {
    fun solution(fees: IntArray, records: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()
        var tempRecords = records.toMutableList()
        var carParkingTime = mutableMapOf<String, Int>()
        
        for (i in 0 until tempRecords.size) {
            if (tempRecords[i].split(" ")[2] == "IN") {
                var count = 0
                for (j in i + 1 until tempRecords.size) {
                    if (tempRecords[i].split(" ")[1] == tempRecords[j].split(" ")[1] &&
                        tempRecords[j].split(" ")[2] == "OUT") {
                        count++
                        
                        var outtime = (tempRecords[j].split(" ")[0].split(":")[0].toInt() * 60) + 
                                      tempRecords[j].split(" ")[0].split(":")[1].toInt()
                        
                        var intime = (tempRecords[i].split(" ")[0].split(":")[0].toInt() * 60) +
                                     tempRecords[i].split(" ")[0].split(":")[1].toInt()
                        
                        val parkingTime = outtime - intime
                        
                        carParkingTime[tempRecords[i].split(" ")[1]] = 
                            carParkingTime.getOrDefault(tempRecords[i].split(" ")[1], 0) + parkingTime
                        break
                    }
                }
                if (count == 0) {
                    var intime = (tempRecords[i].split(" ")[0].split(":")[0].toInt() * 60) +
                                 tempRecords[i].split(" ")[0].split(":")[1].toInt()
                    var outtime = 1439  
                    val parkingTime = outtime - intime
                    
                    carParkingTime[tempRecords[i].split(" ")[1]] = 
                        carParkingTime.getOrDefault(tempRecords[i].split(" ")[1], 0) + parkingTime
                }
            }
        }
        
        carParkingTime = carParkingTime.toSortedMap()
        
        for (time in carParkingTime) {
            if (time.value <= fees[0]) {
                answer += fees[1]
            } else {
                val extraTime = time.value - fees[0]
                val extraFees = if (extraTime % fees[2] == 0) {
                    (extraTime / fees[2]) * fees[3]
                } else {
                    ((extraTime / fees[2]) + 1) * fees[3]
                }
                answer += fees[1] + extraFees
            }
        }
        
        return answer
    }
}
