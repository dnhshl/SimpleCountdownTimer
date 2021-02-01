package com.example.simplecountdowntimer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private val btnShowTimer : Button by lazy { findViewById(R.id.button_showTimer) }
    private val etInput_Termin : EditText by lazy { findViewById(R.id.edit_inputTermin) }
    private val etInput_Dauer : EditText by lazy { findViewById(R.id.edit_inputDauer) }
    private val TAG = "MainActivity"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowTimer.setOnClickListener {
            val intent = Intent(this, ShowTimerActivity::class.java)
            val termin = etInput_Termin.text.toString()
            val dauer = etInput_Dauer.text.toString().toInt()
            intent.putExtra(Constants.TIMERSTRING, termin)
            intent.putExtra(Constants.DAUERINT, dauer)
            startActivity(intent)
            Log.i(TAG, "Button gedrückt")
        }

    }
}