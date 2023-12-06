
//13번. 자릿수 더하기

package com.example.code_kata

//fun solution13(n){
//
//}

fun main(){
    while(true){
        var result=0        //결과값
        var remainder=0     //나머지
        val N= readLine()!!
        val Nlen=N.length
        var Nint=N.toInt()
        if (Nint>100000000)
            continue
        for (i in 0 until Nlen){
            val portion=Nint     //몫
            if (i==0){
                remainder = Nint%10
            }
            else{
                remainder = portion%10
            }
            result+=remainder
            Nint/=10
            println("몫:$portion 나머지:$remainder 결과:$result")
        }
    println(result)
    }
}