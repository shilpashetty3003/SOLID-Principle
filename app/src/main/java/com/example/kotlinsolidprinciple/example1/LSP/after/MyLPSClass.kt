package com.example.kotlinsolidprinciple.example1.LSP.after

class MyLPSClass {

    // Here it is presented a way how to organize these Rectangle and Square classes better to
    // meet the Liskov Substitution Principle. No more unexpected result.
    var rectnagle : Shape  = Rectnagle(2,3)
    var square : Shape = Square(8)
    init {
        rectnagle.area()
        square.area()
    }

}

interface  Shape{
    fun area() :Int
}

class Rectnagle(var width:Int ,var height:Int) : Shape{
    override fun area(): Int {
        return  width*height;
    }
}
class Square(var edge :Int) :Shape{
    override fun area(): Int {
        return edge *edge;
    }
}