package com.srbastian.lyfecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    lateinit var goBackButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        goBackButton = findViewById(R.id.button)

        goBackButton.setOnClickListener {
            var intent = Intent(this@SecondActivity, MainActivity:: class.java)
            startActivity(intent)
        }
        Log.d("OnCreate", "Second Activity OnCreate")
    }
    override fun onStop() {
        super.onStop()
        Log.d("OnCreate", "Second Activity OnStop")
    }

    override fun onPause() {
        super.onPause()
        Log.d("OnCreate", "Second Activity OnPause")
    }

    override fun onStart() {
        super.onStart()
        Log.d("OnCreate", "Second Activity onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("OnCreate", "Second Activity onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("OnCreate", "Second Activity onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("OnCreate", "Second Activity onDestroy")
    }
}