package com.example.kotlinsolidprinciple.example1.DIP.before

class EmailNotification{
    fun sendNotification(message:String){
        println("Sending email notification with message \"$message\"")
    }
}

//The problem is NotificationService depends on EmailNotification to send notifications.

class NotificationService {

    fun sendNotification(message: String) {
        val emailNotification = EmailNotification() // <- here is the dependency
        emailNotification.sendNotification(message)
    }
}

fun main() {
    val notificationService = NotificationService()
    notificationService.sendNotification("Happy Coding") // Output: Sending email notification with message "Happy Coding"
}

