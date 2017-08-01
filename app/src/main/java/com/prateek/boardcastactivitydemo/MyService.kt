package com.prateek.boardcastactivitydemo

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

/**
 * Created by prateek on 1/8/17.
 */

class MyService : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        Toast.makeText(context, "intentdetected", Toast.LENGTH_LONG).show()
    }
}
