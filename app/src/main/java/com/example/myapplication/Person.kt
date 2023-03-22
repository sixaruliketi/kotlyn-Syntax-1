package com.example.myapplication

interface Shape{
    fun getPerimeter()
    fun getArea() : Int
}

open class Rectangle(protected var length : Int, protected var width : Int): Shape {

    override fun getArea(): Int {
        TODO("Not yet implemented")
    }

    override fun getPerimeter(){
        println(2*(length + width))
    }
}

class Parallelepiped(length: Int,width: Int, private var height : Int): Rectangle(length, width){

    override fun getPerimeter() {
        println(4*(length + width + height))
    }

}

fun main(){
    var r1 = Rectangle(5,3)
    var p1 = Parallelepiped(5,3,4)

    r1.getPerimeter()
    p1.getPerimeter()
}







