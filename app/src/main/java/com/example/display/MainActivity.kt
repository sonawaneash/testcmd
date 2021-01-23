package com.example.display

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity() : AppCompatActivity(), View.OnClickListener {



    lateinit var name:EditText
    lateinit var desire:EditText
    lateinit var button: Button
    lateinit var result:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.name)
        desire=findViewById(R.id.desire)
        button=findViewById(R.id.button)
        result=findViewById(R.id.result)

        button.setOnClickListener(this)


    }

    override fun onClick(view: View?) {
        val name1=name.text
        val desire1=desire.text

        result.text="Hello $name1 your desire is $desire1"
    }
}