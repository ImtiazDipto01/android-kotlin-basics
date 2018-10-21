package com.example.dipto.kotlinpractice

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var name : String
    lateinit var email : String
    lateinit var msg : String
    var age : Int = 0

    lateinit var tvHello : TextView
    lateinit var tvname : TextView
    lateinit var tvEmail : TextView
    lateinit var tvAge : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
        initValues()
        updateUI()
    }

    private fun updateUI() {
        tvHello.setText(msg)
        tvname.setText(name)
        tvEmail.setText(email)
        tvAge.setText(age.toString())
    }

    private fun initValues() {
        msg = "Hello Kotlin"
        name = "Imtiaz Uddin Ahmed"
        email = "programmer.imtiaz@gmail.com"
        age = 25
    }

    private fun initView() {
        tvHello = findViewById<TextView>(R.id.tv_hello)
        tvname = findViewById<TextView>(R.id.tv_my_name)
        tvAge = findViewById<TextView>(R.id.tv_my_age)
        tvEmail = findViewById<TextView>(R.id.tv_my_email)
    }
}
