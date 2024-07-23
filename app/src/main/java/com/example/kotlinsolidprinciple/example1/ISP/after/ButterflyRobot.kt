package com.example.kotlinsolidprinciple.example1.ISP.after


// Here no useless method are override which satisfy the ISP Principle.
interface Robot{
    fun givenName(name:String)
    fun reset()
}

interface Talkable{
    fun talk()
}
interface Flyable{
    fun fly()
}
class ButterflyRobot : Robot,Flyable{
    override fun givenName(name: String) {
        TODO("Not yet implemented")
    }

    override fun reset() {
        TODO("Not yet implemented")
    }

    override fun fly() {
        TODO("Not yet implemented")
    }
}

class HumanRobot() : Robot,Talkable{
    override fun givenName(name: String) {
        TODO("Not yet implemented")
    }

    override fun reset() {
        TODO("Not yet implemented")
    }

    override fun talk() {
        TODO("Not yet implemented")
    }

}