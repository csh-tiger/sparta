
//5번. 숫자 비교하기

package com.example.code_kata

fun solution5(num1: Int, num2: Int): Int {
    if(num1==num2)
        return 1
    else
        return -1
}

fun main() {
    while (true) {
        var num1 = readLine()!!.toInt()
        var num2 = readLine()!!.toInt()

        if (num1 < 0 || num1 > 10000 || num2 < 0 || num2 > 10000) {
            continue
        }
        var result = solution5(num1, num2)
        if (result==1)
            println("num1이 ${num1}이고 num2가 ${num2}이므로 같습니다. 따라서 ${result}을 return합니다.")
        if (result==-1)
            println("num1이 ${num1}이고 num2가 ${num2}이므로 다릅니다. 따라서 ${result}을 return합니다.")
    }
}