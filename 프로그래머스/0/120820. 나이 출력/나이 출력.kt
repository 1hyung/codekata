// age가 주어질 때 출생 연도를 return하는 함수
class Solution {
    fun solution(age: Int): Int = 2022 - (age - 1) // 태어난 해에 1살이므로, age - 1을 기준으로 현재 연도에서 빼줌. 단일 표현식 함수로 표현
}