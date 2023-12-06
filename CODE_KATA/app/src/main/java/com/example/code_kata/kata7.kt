
//7번. 두 수의 나눗셈

package com.example.code_kata


fun solution7(num1: Int, num2: Int): Double {
    var answer = num1.toDouble() / num2 * 1000
    return answer
}

fun main() {
    while (true) {
        var num1 = readLine()!!.toInt()
        var num2 = readLine()!!.toInt()

        if (num1 < 0 || num1 > 10000 || num2 < 0 || num2 > 10000) {
            continue
        }
        var result = solution7(num1, num2)
//        if(result)
//        println("num1이 ${num1}, num2가 ${num2}이므로 ${num1} / ${num2} = ${divide}에 1,000을 곱하면 ${result}이 됩니다.")
    }
}