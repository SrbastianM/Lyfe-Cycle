package com.srbastian.lyfecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var textView: TextView
    lateinit var plusButton: Button
    lateinit var nextButton: Button
    var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.count)
        plusButton = findViewById(R.id.plusButton)
        nextButton = findViewById(R.id.nextButton)

        plusButton.setOnClickListener {
            counter += 1
            textView.text = "" + counter
        }

        nextButton.setOnClickListener {
            var intent = Intent(this@MainActivity, SecondActivity::class.java)
            startActivity(intent)
        }

        Log.d("OnCreate", "First Activity OnCreate")

    }

    override fun onStop() {
        super.onStop()
        Log.d("OnCreate", "First Activity OnStop")
    }

    override fun onPause() {
        super.onPause()
        Log.d("OnCreate", "First Activity OnPause")
    }

    override fun onStart() {
        super.onStart()
        Log.d("OnCreate", "First Activity onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("OnCreate", "First Activity onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("OnCreate", "First Activity onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("OnCreate", "First Activity onDestroy")
    }


}