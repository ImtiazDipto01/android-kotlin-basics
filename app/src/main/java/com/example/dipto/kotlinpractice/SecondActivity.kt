package com.example.dipto.kotlinpractice

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        addFragment(FragmentOne(), "fragmentOne")
    }

    fun addFragment(fragment: Fragment, fragTag: String){
        val transaction: FragmentTransaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.container, fragment, fragTag)
        transaction.commit()
    }

}
