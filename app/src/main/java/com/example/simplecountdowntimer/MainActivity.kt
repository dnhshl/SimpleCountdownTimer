package com.example.simplecountdowntimer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private val btnShowTimer : Button by lazy { findViewById(R.id.button_showTimer) }
    private val etInput : EditText by lazy { findViewById(R.id.edit_inputTermin) }
    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowTimer.setOnClickListener {
            val intent = Intent(this, ShowTimerActivity::class.java)
            val message = etInput.text.toString()
            intent.putExtra("Timerstring", message)
            startActivity(intent)
            Log.i(TAG, "Button gedrückt")
        }

    }
}