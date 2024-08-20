fun main(args: Array<String>) {
    // 표준 입력으로 두 개의 정수 n과 m을 받습니다.
    val (n, m) = readLine()!!.split(' ').map { it.toInt() }
    
    // 가로로 n개의 별을 가진 문자열을 만듭니다.
    val row = "*".repeat(n)
    
    // 이 문자열을 m번 반복해서 출력합니다.
    for (i in 1..m) {
        println(row)
    }
}