package com.example.kotlinsolidprinciple.example1.OCP.before

import android.util.Log
import android.widget.Toast

class MyClass {

    var feedBackManager = FeedBackManager()
    init {

        feedBackManager.showToast(CustomToast())
    }

}
class FeedBackManager(){



    // Imagine that we need to add new type feedback message. What would happen?
    // We would need to modify this manager class. But to follow Open Closed Principle we
    // need to write a code that can be adapted automatically to the new requirements without
    // rewriting the old classes.


    fun showToast(customToast: CustomToast) {
        Log.d("TAG", "showToast: ")
    }

    fun showSnackbar(customSnackbar: CustomSnackbar) {
        Log.d("TAG", "showSnackbar: ")

    }

}

class CustomToast {

    var welcomeText: String = "Hello, this is toast message!"
    var welcomeDuration: Int = Toast.LENGTH_SHORT
}

class CustomSnackbar {

    var goodbyeText: String = "Goodbye, this is snackbar message.."
    var goodbyeDuration: Int = Toast.LENGTH_LONG
}