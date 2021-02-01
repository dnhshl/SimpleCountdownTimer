package com.example.simplecountdowntimer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import splitties.toast.toast

class ShowTimerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_timer)

        val intent = intent
        val message = intent.getStringExtra("Timerstring") ?: ""

        toast(message)

    }
}