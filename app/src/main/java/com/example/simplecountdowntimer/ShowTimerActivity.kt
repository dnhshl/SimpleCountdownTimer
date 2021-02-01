package com.example.simplecountdowntimer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.TextView
import splitties.toast.toast

class ShowTimerActivity : AppCompatActivity() {

    private val tvTermin : TextView by lazy { findViewById(R.id.textView_termin) }
    private val tvDauer : TextView by lazy { findViewById(R.id.textView_dauer) }

    var termin = ""
    var countdown = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_timer)

        val intent = intent
        termin = intent.getStringExtra(Constants.TIMERSTRING) ?: ""
        countdown = intent.getIntExtra(Constants.DAUERINT, 0)

        tvTermin.text = termin
        tvDauer.text = countdown.toString()
    }
    

}