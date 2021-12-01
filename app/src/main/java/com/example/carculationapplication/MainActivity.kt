package com.example.carculationapplication

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    val n = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


    fun addClick(v : View){

        try {
            val firstNumber = findViewById<EditText>(R.id.firstInputText)

            val secondNumber = findViewById<EditText>(R.id.secondInputText)

            val result = findViewById<TextView>(R.id.resultText)

            val n1 = Integer.parseInt(firstNumber.text.toString())

            val n2 = Integer.parseInt(secondNumber.text.toString())

            result.setText(Integer.toString((n1 + n2)))

        } catch (e : Exception){
            Toast.makeText(applicationContext, "문자가 입력되었습니다", Toast.LENGTH_SHORT).show()
        }

    }

    fun minusClick(v : View){

        try{
            val firstNumber = findViewById<EditText>(R.id.firstInputText)

            val secondNumber = findViewById<EditText>(R.id.secondInputText)

            val result = findViewById<TextView>(R.id.resultText)

            val n1 = Integer.parseInt(firstNumber.text.toString())

            val n2 = Integer.parseInt(secondNumber.text.toString())

            result.setText(Integer.toString((n1 - n2)))
        } catch(e : Exception) {
            Toast.makeText(applicationContext, "문자가 입력되었습니다", Toast.LENGTH_SHORT).show()
        }



    }

    fun multiplyClick(v : View){


        try {
            val firstNumber = findViewById<EditText>(R.id.firstInputText)

            val secondNumber = findViewById<EditText>(R.id.secondInputText)

            val result = findViewById<TextView>(R.id.resultText)

            val n1 = Integer.parseInt(firstNumber.text.toString())

            val n2 = Integer.parseInt(secondNumber.text.toString())

            result.setText(Integer.toString((n1 * n2)))

        } catch(e : Exception){
            Toast.makeText(applicationContext, "문자가 입력되었습니다", Toast.LENGTH_SHORT).show()
        }

    }

    fun divideClick(v : View){

        try {
            val firstNumber = findViewById<EditText>(R.id.firstInputText)

            val secondNumber = findViewById<EditText>(R.id.secondInputText)

            val result = findViewById<TextView>(R.id.resultText)

            val n1 = Integer.parseInt(firstNumber.text.toString())

            val n2 = Integer.parseInt(secondNumber.text.toString())

            result.setText(Integer.toString((n1 % n2)))

        } catch(e : Exception){
            Toast.makeText(applicationContext, "문자가 입력되었습니다", Toast.LENGTH_SHORT).show()
        }


    }



}

