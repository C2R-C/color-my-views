package com.c2r.colormyviews

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.text.BreakIterator

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    private fun makeColored(view: View) {
          if (view.id != R.id.constraint_layout) {
            when (view.id) {
                // English: Boxes using Color class colors for the background.
                // Span|ish: Las cajas usan los colores de la clase Color para el fondo.
                R.id.box_one_text -> view.setBackgroundResource(R.drawable.cake)
                R.id.box_two_text -> view.setBackgroundResource(R.drawable.clock)
                R.id.box_three_text -> view.setBackgroundResource(R.drawable.driver)
                R.id.box_four_text -> view.setBackgroundResource(R.drawable.train)
                R.id.box_five_text -> view.setBackgroundResource(R.drawable.desktop)
                else -> Toast.makeText(this, "Oprime en una figura", Toast.LENGTH_SHORT).show()
            }
        } else view.setBackgroundColor(randomColor())
    }

    private fun setListeners() {

        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)
        val constLayout = findViewById<View>(R.id.constraint_layout)

        val clickableViews: List<View> =
            listOf(boxOneText, boxTwoText, boxThreeText, boxFourText, boxFiveText, constLayout)

        for (click in clickableViews) {
            click.setOnClickListener { makeColored(it) }
        }
    }

    private fun randomColor(): Int {
        val item = (1..9).random()

        val color = when (item) {
            1 -> Color.DKGRAY
            2 -> Color.GRAY
            3 -> Color.BLUE
            4 -> Color.MAGENTA
            5 -> Color.BLUE
            6 -> Color.BLACK
            7 -> Color.GREEN
            8 -> Color.YELLOW
            9 -> Color.GRAY
            else -> Color.WHITE
        }
        return color
    }
}