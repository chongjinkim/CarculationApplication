package com.example.carculationapplication

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val n = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


    fun addClick(v : View){
        val firstNumber = findViewById<EditText>(R.id.firstInputText)

        val secondNumber = findViewById<EditText>(R.id.secondInputText)

        val result = findViewById<TextView>(R.id.resultText)

        val n1 = Integer.parseInt(firstNumber.text.toString())

        val n2 = Integer.parseInt(secondNumber.text.toString())

        result.setText(Integer.toString((n1 + n2)))
    }

    fun minusClick(v : View){

        val firstNumber = findViewById<EditText>(R.id.firstInputText)

        val secondNumber = findViewById<EditText>(R.id.secondInputText)

        val result = findViewById<TextView>(R.id.resultText)

        val n1 = Integer.parseInt(firstNumber.text.toString())

        val n2 = Integer.parseInt(secondNumber.text.toString())

        result.setText(Integer.toString((n1 - n2)))
    }

    fun multiplyClick(v : View){

        val firstNumber = findViewById<EditText>(R.id.firstInputText)

        val secondNumber = findViewById<EditText>(R.id.secondInputText)

        val result = findViewById<TextView>(R.id.resultText)

        val n1 = Integer.parseInt(firstNumber.text.toString())

        val n2 = Integer.parseInt(secondNumber.text.toString())

        result.setText(Integer.toString((n1 * n2)))
    }

    fun divideClick(v : View){

        val firstNumber = findViewById<EditText>(R.id.firstInputText)

        val secondNumber = findViewById<EditText>(R.id.secondInputText)

        val result = findViewById<TextView>(R.id.resultText)

        val n1 = Integer.parseInt(firstNumber.text.toString())

        val n2 = Integer.parseInt(secondNumber.text.toString())

        result.setText(Integer.toString((n1 % n2)))
    }



}

