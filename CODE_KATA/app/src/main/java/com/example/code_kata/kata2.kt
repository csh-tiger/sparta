
//2번. 두 수의 곱

package com.example.code_kata

fun solution2(num1: Int, num2: Int): Int {
    var answer = num1 * num2
    return answer
}

fun main() {
    while (true) {
        var num1 = readLine()!!.toInt()
        var num2 = readLine()!!.toInt()

        if (num1 < 0 || num1 > 10000 || num2 < 0 || num2 > 10000) {
            continue
        }
        var result = solution2(num1, num2)
        println("num1이 ${num1}, num2가 ${num2}이므로 ${num1} * ${num2} = ${result}를 return합니다.")
    }
}