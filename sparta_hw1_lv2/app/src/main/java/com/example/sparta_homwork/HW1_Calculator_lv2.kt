package com.example.sparta_homwork

class Calculator(){
    private var result=0

    fun plus(num1:Int, num2:Int):Int{
        return num1+num2
    }

    fun minus(num1:Int, num2:Int):Int {
        return num1-num2
    }

    fun multiply(num1:Int, num2:Int):Int {
        return num1*num2
    }

    fun divide(num1:Int, num2:Int):Int {
        return num1/num2
    }
}

fun main() {
    var operatorlist= mutableListOf<Char>()
    var result:Int=0
    val cal=Calculator()
    println("계산식을 입력하세요. 종료하려면 'q'를 입력하세요.")
    var formula=readLine() //계산식 입력
    while(true){
//        var formula=readLine() //계산식 입력
        if(formula=="q"){
            println("종료")
            break
        }
        else{
            val str=formula?.substring(0,2)
            if(str!=null &&"+" in str){
                val num1= str[0].toString().toInt()
                val num2= str[2].toString().toInt()
                result=cal.plus(num1,num2)
            }
            else if(str!=null &&"-" in str){
                val num1= str[0].toString().toInt()
                val num2= str[2].toString().toInt()
                result=cal.minus(num1,num2)
            }
            else if(str!=null &&"*" in str){
                val num1= str[0].toString().toInt()
                val num2= str[2].toString().toInt()
                result=cal.multiply(num1,num2)
            }
            else if(str!=null &&"+" in str){
                val num1= str[0].toString().toInt()
                val num2= str[2].toString().toInt()
                result=cal.divide(num1,num2)
            }
        formula=str?.substring(2)

        }
//        val part=formula.split("\\+|-\\*|/")    //연산자기준 분리
//        val intpart=part.map{it.toInt()}
//        for (str in formula) {
//            if (str == '+' || str == '-' || str == '*' || str == '/')
//                operatorlist.add(str)   //연산자
//        }
//        result=intpart[0]
//        if(intpart.isNotEmpty()) {
//            intpart.remove(intpart[0])
//        }
//        if (operatorlist.isNotEmpty() && operatorlist[0] == '+') {
//            cal.plus(result)
//        }
//        else if (operatorlist.isNotEmpty() && operatorlist[0] == '-') {
//            cal.minus(result)
//        }
//        else if (operatorlist.isNotEmpty() && operatorlist[0] == '*') {
//            cal.multiply(result)
//        }
//        else{
//            cal.divide(result)
//        }
//        operatorlist.remove(operatorlist[0])
//        if(operatorlist.isEmpty())
    }


}