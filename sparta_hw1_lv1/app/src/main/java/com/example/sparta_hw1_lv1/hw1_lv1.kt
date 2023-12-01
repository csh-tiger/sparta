package com.example.sparta_hw1_lv1

class Calculator(){
    private var result=0

    fun plus(num:Int){
        result+=num
    }

    fun minus(num:Int) {
        result-=num
    }

    fun multiply(num:Int) {
        result*=num
    }

    fun divide(num:Int) {
        result/=num
    }

    fun result():Int{
        return result
    }

    fun clear(){
        result=0
    }


}

fun main(){
    val cal=Calculator()
    cal.plus(5)
    cal.multiply(4)
    cal.divide(2)
    cal.minus(10)
    val result=cal.result()
    println("계산결과 : ${result}")
    cal.clear()
}