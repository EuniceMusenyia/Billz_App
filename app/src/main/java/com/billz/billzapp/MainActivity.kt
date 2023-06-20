package com.billz.billzapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout


class MainActivity : AppCompatActivity() {

    lateinit var tvlogin: TextView
    lateinit var tilusername: TextInputLayout
    lateinit var tilphoneno: TextInputLayout
    lateinit var tilemail: TextInputLayout
    lateinit var tilpassword: TextInputLayout
    lateinit var etusername: TextInputEditText
    lateinit var etphoneno: TextInputEditText
    lateinit var etemail: TextInputEditText
    lateinit var etpassword: TextInputEditText
    lateinit var btnsignup: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castViews()


    }

    override fun onResume() {
        super.onResume()
        login.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }
        btnsignup.setOnClickListener {
            validateSignUp()
        }
    }

    fun castViews() {
        tvlogin = findViewById(R.id.tvlogin)
        tilusername = findViewById(R.id.etusername)
        tilphoneno = findViewById(R.id.tilphoneno)
        tilemail = findViewById(R.id.tilemail)
        tilpassword = findViewById(R.id.tilpassword)
        btnsignup = findViewById(R.id.btnsignup)
        etusername = findViewById(R.id.etusername)
        etphoneno = findViewById(R.id.etphoneno)
        etemail = findViewById(R.id.etemail)
        etpassword = findViewById(R.id.etpassword)
        btnsignup = findViewById(R.id.btnsignup)


    }

    fun validateSignUp() {
        val username = etusername.text.toString()
        val phoneNumber = etphoneno.text.toString()
        val email = etemail.text.toString()
        val password = etpassword.text.toString()
        var error = false
        if (username.isBlank()) {
            etusername.error = "username is required"
            error = true
        }

        if (phoneNumber.isBlank()) {
            etphoneno.error = "phone number is required"
            error = true
        }
        if (email.isBlank()) {
            etemail.error = "Email is required"
            error = true
        }
        if (password.isBlank()) {
            etpassword.error = "Password  is required"
            error = true
        }

        if (!error)
            Toast
                .makeText(this, "$username $phoneNumber $email", Toast.LENGTH_LONG)
                .show()
    }
}
