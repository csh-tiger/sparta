package com.example.code_kata

fun main(){
    while(true){
        val num1=readLine()!!.toInt()
        val num2=readLine()!!.toInt()

//        val divide=num1/num2.toDouble()
//        println(divide)
        val multi=num1/num2*1000
        println(multi)
        val integerPart=multi.toInt()
        val decimalPart=multi-integerPart
    }
}
//소수점자리가 0보다 크면 실수, 0이면 정수