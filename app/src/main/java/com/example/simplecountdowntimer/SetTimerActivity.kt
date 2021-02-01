package com.example.simplecountdowntimer

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TimePicker
import splitties.toast.longToast

class SetTimerActivity : AppCompatActivity() {

    private val btnOK : Button by lazy { findViewById(R.id.buttonOKID) }
    private val timePicker : TimePicker by lazy { findViewById(R.id.timePickerID) }
    private val TAG = "SetTimerActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_set_timer)

        timePicker.setIs24HourView(true)

        btnOK.setOnClickListener {
            val hour = timePicker.hour
            val minute = timePicker.minute
            var intent = Intent()
            intent.putExtra("Stunde", hour)
            intent.putExtra("Minute", minute)
            setResult(Activity.RESULT_OK, intent)
            finish()

            longToast(hour.toString() + ":" + minute.toString() )
        }

    }
}