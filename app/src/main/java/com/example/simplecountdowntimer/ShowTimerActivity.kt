package com.example.simplecountdowntimer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import splitties.toast.toast

class ShowTimerActivity : AppCompatActivity() {

    private val tvTermin : TextView by lazy { findViewById(R.id.textView_termin) }
    private val tvDauer : TextView by lazy { findViewById(R.id.textView_dauer) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_timer)

        val intent = intent
        val termin = intent.getStringExtra(Constants.TIMERSTRING) ?: ""
        val dauer = intent.getStringExtra(Constants.DAUERINT) ?: ""

        tvTermin.text = termin
        tvDauer.text = dauer
    }
}