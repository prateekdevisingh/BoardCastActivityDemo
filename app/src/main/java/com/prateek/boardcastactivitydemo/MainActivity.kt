package com.prateek.boardcastactivitydemo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun broadcastIntent(view: View) {
        val intent = Intent()
        intent.action = "com.prateek.CUSTOM_INTENT"
        sendBroadcast(intent)

    }
}
