package com.example.kotlinsolidprinciple.example1.ISP.before

interface Robot {
    fun giveName(newName: String)
    fun reset()
    fun fly()
    fun talk()
}

// Here  Talk method is useless which violates  the ISP Principle
class ButterflyRobot  :Robot{
    var name: String = ""
    override fun giveName(newName: String) {
        name = newName
    }

    override fun reset() {
            // Implement
    }

    override fun fly() {
        // Implement
    }

    override fun talk() {
        //NO Use
    }
}
// Same here the fly method is useless.
class HumanRoboid():Robot{
    var name: String = ""
    override fun giveName(newName: String) {
        name = newName
    }

    override fun reset() {
        // Implement
    }

    override fun fly() {
        // NO Use
    }

    override fun talk() {
        // Implement
    }

}