
//8번. 각도기

package com.example.code_kata

fun solution8(num: Int):Int{
    if(num>0 && num<90)
        return 1
    else if (num==90)
        return 2
    else if (num>90 && num<180)
        return 3
    else
        return 4
}

fun main(){
    while(true){
        val angle = readLine()!!.toInt()
        if(angle<=0 || angle>180)
            continue
        val result = solution8(angle)
        when(result){
            1 -> println("angle이 ${angle}이므로 예각입니다. 따라서 ${result}을 return합니다.")
            2 -> println("angle이 ${angle}이므로 직각입니다. 따라서 ${result}을 return합니다.")
            3 -> println("angle이 ${angle}이므로 둔각입니다. 따라서 ${result}을 return합니다.")
            4 -> println("angle이 ${angle}이므로 평각입니다. 따라서 ${result}을 return합니다.")
        }
    }
}