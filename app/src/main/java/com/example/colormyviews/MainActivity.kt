package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewStructure

class MainActivity : AppCompatActivity() {

    val box_one = findViewById<View>(R.id.box_one_text)
    val box_two = findViewById<View>(R.id.box_two_text)
    val box_three = findViewById<View>(R.id.box_three_text)
    val box_four = findViewById<View>(R.id.box_four_text)
    val box_five = findViewById<View>(R.id.box_five_text)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val clickableViews: List<View> = listOf(box_one, box_two, box_three, box_four, box_five, )

        for(item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }

    fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}