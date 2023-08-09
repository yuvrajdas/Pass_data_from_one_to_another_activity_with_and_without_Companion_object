package com.example.angularandroidcommunication1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    companion object{
        var KEY : String? = null
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var inputText = findViewById<EditText>(R.id.txtInput)
        var button = findViewById<Button>(R.id.btn)
        var coBtn = findViewById<Button>(R.id.co_btn)
        coBtn.setOnClickListener{
            val inputVal = inputText.text.toString();
            val intent = Intent(applicationContext, MainActivity2::class.java)
            intent.putExtra(KEY, inputVal)
            startActivity(intent)

        }
        button.setOnClickListener{
            val inputValue = inputText.text.toString()
            Toast.makeText(applicationContext, inputText.text.toString(), Toast.LENGTH_LONG).show()
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("inputValue", inputValue)

            startActivity(intent)
        }
    }

}