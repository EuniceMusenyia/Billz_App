package com.billz.billzapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.billz.billzapp.databinding.LoginBinding

class login: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    companion object {
        fun setOnClickListener(function: () -> Unit) {

        }
    }
}
