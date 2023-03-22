package com.example.myapplication

class Fraction (var numerator : Int, var denominator : Int) {

    override fun equals(other: Any?): Boolean {
        if (other is Fraction){
            if (numerator * other.denominator / denominator == other.numerator){
                return true
            }
        }
        return false
    }

    override fun toString(): String {
        return "$numerator / $denominator"
    }

}

fun main(){

    var f1 = Fraction(3,4)
    var f2 = Fraction(3,4)

    println(f1)
    println(f1.equals(f2))

}