// 직사각형 별찍기
fun main(args: Array<String>) {
    val (n, m) = readln().split(" ").map { it.toInt() } // 입력값 n, m 추출

    repeat(m) { // 세로 길이만큼 반복
        println("*".repeat(n)) // 가로 길이만큼 * 출력
    }
}