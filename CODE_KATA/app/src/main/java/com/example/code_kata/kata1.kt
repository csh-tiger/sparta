
//1번. 두 수의 차

package com.example.code_kata

fun solution1(num1: Int, num2: Int): Int {
//    var answer: Int = 0
    var answer = num1 - num2
    return answer
}

fun main() {
    while (true) {
        var num1 = readLine()!!.toInt()
        var num2 = readLine()!!.toInt()

        if (num1 < -50000 || num1 > 50000 || num2 < -50000 || num2 > 50000) {
            continue
        }
        var result = solution1(num1, num2)
        print(result)
    }
}