package com.example.unit5maria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class FinalPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final_page)
        var intent = intent
        val firstname = intent.getStringExtra("First Name")
        val lastname = intent.getStringExtra("Last Name")
        val email = intent.getStringExtra("Email Address")
        val age = intent.getStringExtra("Age")
        val hbdy = intent.getStringExtra("BirthDate")
        val phonenumber = intent.getStringExtra("Phone Number")

        val resultTv = findViewById<TextView>(R.id.accountInfo)
        resultTv.text = "First Name: " +firstname+"\nLast Name:"+lastname+"\nEmail:"+email+" \nAge:"+age+"\nBirth Date:"+hbdy+"\nPhone Number: "+phonenumber+"\n"
    }
}