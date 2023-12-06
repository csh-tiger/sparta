
//9번. 짝수의 합

package com.example.code_kata


fun solution9(num:Int):Int{
    var sum=0
    for (i in 0..num){
        if (i%2==0)
            sum = sum + i
    }
    return sum
}

fun main(){
    while(true){
        val n = readLine()!!.toInt()
        if (n<=0 || n>1000)
            continue
        val result = solution9(n)
        print("n이 ${n}이므로 ")
        for (i in 0..n) {
            if(i%2==0)
                print(i)
            else if (i!=n)
                print("+")
        }
        println("=${result}을 return합니다.")
    }
}