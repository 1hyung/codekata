fun main(args: Array<String>) {
    val (n, m) = readLine()!!.split(' ').map(String::toInt) // 입력값 처리
    List(m) { "*".repeat(n) }.forEach { println(it) } // m개의 '*'로 이루어진 리스트 생성 후 출력
}