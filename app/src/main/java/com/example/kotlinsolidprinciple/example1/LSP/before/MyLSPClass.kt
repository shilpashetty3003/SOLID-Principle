package com.example.kotlinsolidprinciple.example1.LSP.before

//Child type should be able to replace the parent without changing the behavior of the program.


class MyLSPClass {

    val rectangleFirst :Rectangle = Rectangle()
    init {
        rectangleFirst.widht = 2
        rectangleFirst.height = 3
    }
    val first = rectangleFirst.area()  // here the answer is 6 which is right

    val rectangleSecond :Rectangle = Square()
    init {
        rectangleSecond.widht = 2
        rectangleSecond.height = 3
    }
    val second = rectangleSecond.area()    // here the answer should be 6 but answer is 9. which violates the Liskov  Substitution Principle
    // Bacause the behaviour of parent class changed because of child class
}

open class Rectangle{
    open var height : Int  =0 ;
    open var widht : Int  = 0;
    open fun area():Int{
        return widht * height;
    }
}

class Square : Rectangle(){
    override var widht: Int
        get() = super.widht
        set(value) {
            super.widht  = widht
            super.height = widht
        }

    override var height: Int
        get() = super.height
        set(value) {
            super.widht = height
            super.height = height
        }
}