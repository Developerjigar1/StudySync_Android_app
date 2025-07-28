package com.example.myapplication

import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.view.Gravity
import android.view.ViewGroup
import android.graphics.Typeface
import android.graphics.Color
import com.example.myapplication.R

class SubjectActivity : AppCompatActivity() {

    private val subjects = listOf("Mathematics", "Physics", "Chemistry", "English", "Computer Science")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_subject)

        val subjectListLayout = findViewById<LinearLayout>(R.id.subjectList)

        for (subject in subjects) {
            val textView = TextView(this)
            textView.text = subject
            textView.textSize = 18f
            textView.setTextColor(Color.DKGRAY)
            textView.setPadding(20, 30, 20, 30)
            textView.setTypeface(null, Typeface.BOLD)
            textView.setBackgroundResource(android.R.drawable.dialog_holo_light_frame)

            val params = LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            )
            params.setMargins(0, 0, 0, 20)
            textView.layoutParams = params
            textView.gravity = Gravity.CENTER_VERTICAL

            subjectListLayout.addView(textView)
            }
        }
}
