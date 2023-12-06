
//6번. 두 수의 합

package com.example.code_kata

fun solution6(num1: Int, num2: Int): Int {
    var answer = num1 + num2
    return answer
}

fun main() {
    while (true) {
        var num1 = readLine()!!.toInt()
        var num2 = readLine()!!.toInt()

        if (num1 < -50000 || num1 > 50000 || num2 < -50000 || num2 > 50000) {
            continue
        }
        var result = solution6(num1, num2)
        println("num1이 ${num1}, num2가 ${num2}이므로 ${num1} + ${num2} = ${result}를 return합니다.")
    }
}