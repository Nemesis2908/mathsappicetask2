package com.usaid.mathsapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //code starts here
        val inputOne = findViewById<EditText>(R.id.edTnumberOne)
        val inputTwo = findViewById<EditText>(R.id.edTnumberTwo)
        val equal = findViewById<Button>(R.id.btnEqual)
        val tvAnswer = findViewById<TextView>(R.id.edTanswer)

        equal.setOnClickListener {
            var inputOneString = inputOne.text.toString()
            var inputTwoString = inputTwo.text.toString()
            val inputOneInt: Int
            val inputTwoInt: Int

            //convert into number
            inputOneInt = inputOneString.toInt()
            inputTwoInt = inputTwoString.toInt()

           var Answer = inputOneInt + inputTwoInt
            tvAnswer.text = Answer.toString()
        }//end of equal.setOnClickListener
    }//end of onCreate
}