package com.example.simplecountdowntimer

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.provider.Settings
import android.widget.TextView
import splitties.toast.toast

class ShowTimerActivity : AppCompatActivity() {

    private val tvTermin : TextView by lazy { findViewById(R.id.textView_termin) }
    private val tvDauer : TextView by lazy { findViewById(R.id.textView_dauer) }

    var termin = ""
    var countdown = 0
    private val mHandler : Handler by lazy { Handler() }
    private lateinit var mRunnable: Runnable


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_timer)

        val intent = intent
        termin = intent.getStringExtra(Constants.TIMERSTRING) ?: ""
        countdown = intent.getIntExtra(Constants.DAUERINT, 0)

        tvTermin.text = termin
        tvDauer.text = countdown.toString()

        countdownStart()
    }

    private fun countdownStart(){
        mRunnable = Runnable {
            countdown--
            tvDauer.text = countdown.toString()
            if (countdown > 0) mHandler.postDelayed(mRunnable, 1000)
            if (countdown == 0){
                val player = MediaPlayer.create(applicationContext,
                    Settings.System.DEFAULT_NOTIFICATION_URI)
                player.start()
            }
        }
        mHandler.postDelayed(mRunnable, 1000)
    }

}