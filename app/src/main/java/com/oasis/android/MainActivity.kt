package com.oasis.android

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.oasis.android.ui.login.LoginActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(Intent(this,LoginActivity::class.java))
    }

}
