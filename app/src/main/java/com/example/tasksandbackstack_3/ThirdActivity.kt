package com.example.tasksandbackstack_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        Log.d("MyLogMainActivity", "onCreate")


    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MyLogMainActivity", "onRestart")
    }

    override fun onStart() {
        super.onStart()
        Log.d("MyLogMainActivity", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MyLogMainActivity", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MyLogMainActivity", "onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MyLogMainActivity", "onDestroy")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MyLogMainActivity", "onStop")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("MyLogMainActivity", "onSaveInstanceState")
    }
}