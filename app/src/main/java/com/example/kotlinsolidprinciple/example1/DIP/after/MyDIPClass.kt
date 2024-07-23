package com.example.kotlinsolidprinciple.example1.DIP.after


//The Dependency Inversion Principle states that the most flexible systems are those in which code dependencies refer only to abstractions, not to concretions.
interface  Notification{
    fun sendNotification(message:String)
}

class EmailNotification :Notification{
    override fun sendNotification(message: String) {
        println("Sending email notification with message \"$message\"")
    }
}

class SMSNotification:Notification{
    override fun sendNotification(message: String) {
        println("Sending sms notification with message \"$message\"")
    }
}

class NotificationService{

    var notification : Notification?= null
    fun sendMessage(message: String){
        notification?.sendNotification(message)
    }
}
fun main(){
    var nf = NotificationService()
    var notification :Notification

    // send Email Notification
    notification = EmailNotification()
    nf.notification = notification
    notification.sendNotification(" From Email Service")

    // send SMS Notification
    notification = SMSNotification()
    nf.notification = notification
    nf.sendMessage("From SMS Service")




}
