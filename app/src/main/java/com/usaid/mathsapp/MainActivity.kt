package com.usaid.mathsapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
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

            //if(condition){true} else if(2nd condition) {true} else {false}
            //check if user input is valid
            if (inputOneString.equals(String) || inputTwoString.equals(String)) {
            }else tvAnswer.text = "Please enter a number"

                //convert into number
                inputOneInt = inputOneString.toInt()
                inputTwoInt = inputTwoString.toInt()

                var Answer = inputOneInt + inputTwoInt
                tvAnswer.text = Answer.toString()
            
        }//end of equal.setOnClickListener
    }//end of onCreate
}