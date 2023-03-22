package com.example.myapplication


fun main(){

    val grade = -90
    if (grade > 0 && grade < 51){
        println("failed")
    } else if (grade >= 51 && grade < 61){
        println("E")
    } else if (grade >= 61 && grade < 71){
        println("D")
    } else if (grade >= 71 && grade < 81){
        println("C")
    } else if (grade >= 81 && grade < 91){
        println("B")
    } else if (grade >= 91 && grade <= 100){
        println("A")
    } else {
        println("doesn't make sense")
    }

    when (grade){
        in 0 until 51 -> println("F")
        in 51..100 -> println("not failed")
        else -> println("doesn't make sense")
    }

    var x = 11
    while (x < 10){
        println(x)
        x++
    }

    do {
        println(x)
        x++
    } while (x<10)


    var name = "my name!"
    for (n in name){
        println(n)
    }

    add3(5)
}

fun add3(i : Int) : Int{
    return i + 3
}











