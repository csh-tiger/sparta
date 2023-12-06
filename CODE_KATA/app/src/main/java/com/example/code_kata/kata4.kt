
//4번. 나이 출력

package com.example.code_kata

fun solution4(num: Int):Int{
    var pastage = 2022-num+1
    return pastage
}

fun main(){
    while(true){
        val age = readLine()!!.toInt()
        if (age<=0 || age>120)
            continue
        val result= solution4(age)
        println("2022년 기준 ${age-1}살이므로 ${result}생입니다.")
    }
}