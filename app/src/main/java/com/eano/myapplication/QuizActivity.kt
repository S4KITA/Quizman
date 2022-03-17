package com.eano.myapplication

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class QuizActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        val mButtonAnswerA: Button = findViewById(R.id.mButtonAnswerA)
        val mButtonAnswerB: Button = findViewById(R.id.mButtonAnswerB)
        val mButtonAnswerC: Button = findViewById(R.id.mButtonAnswerC)
        val mButtonAnswerD: Button = findViewById(R.id.mButtonAnswerD)

        mButtonAnswerA.setOnClickListener {

        }

        mButtonAnswerB.setOnClickListener {

        }

        mButtonAnswerC.setOnClickListener {

        }

        mButtonAnswerD.setOnClickListener {

        }
    }
}