package com.example.angularandroidcommunication1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //Retrieving data from one activity to another activity using Companion Object
        if(intent.getStringExtra(MainActivity.KEY)!=null){
            val receivedValue = intent.getStringExtra(MainActivity.KEY)
            Toast.makeText(applicationContext, receivedValue+" second Activity", Toast.LENGTH_LONG).show()
        }

        // Retrieving data form one activity to another activity without using companion object
        if(intent.getStringExtra("inputValue")!=""){
            val receivedValue = intent.getStringExtra("inputValue")
            Toast.makeText(applicationContext, receivedValue+"second Activity", Toast.LENGTH_LONG).show()
        }
    }
}