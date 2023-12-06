
//11번. 짝수와 홀수

package com.example.code_kata

fun solution11(num:Int):String{

    if(num%2==0) {
        return "Even"
    }
    else
        return "Odd"
}

fun main(){
    while(true){
        val num=readLine()!!.toInt()
        val result=solution11(num)
        println(result)
    }
}