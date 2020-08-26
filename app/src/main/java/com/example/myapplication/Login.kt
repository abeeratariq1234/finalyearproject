package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        login.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
        signup.setOnClickListener {
            startActivity(Intent(this, Signup::class.java))
        }
        forgot.setOnClickListener {
            startActivity(Intent(this, Forgot::class.java))
        }
    }

}