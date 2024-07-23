package com.example.kotlinsolidprinciple.example1.OCP.after

import android.util.Log
import android.view.View

class MyOCPClass {

    var feedBackManager = FeedBackManager()
    init {
        feedBackManager.showMessage(CustomToast())
    }

}

class FeedBackManager{

    // Again the same situation - we need to add new type feedback message. We have to write code
    // that can be adapted to new requirements without changing the old class implementation.
    // Here the solution is to focus on extending the functionality by using interfaces and it
    // follows the Open Closed Principl
    fun showMessage(message: Message){
        message.sendMessage()
    }
}

class  CustomToast: Message{
    override fun sendMessage() {
        Log.d("TAG", "Send Custom Toast: ")
    }
}

class SnackBarMessage: Message{
    override fun sendMessage() {
        Log.d("TAG", "SnackBarMessage : ")
    }
}

interface  Message{
    fun sendMessage()
}