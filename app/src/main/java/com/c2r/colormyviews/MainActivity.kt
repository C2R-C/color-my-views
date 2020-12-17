package com.c2r.colormyviews

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    private fun makeColored(view: View) {
        when (view.id) {
            // English: Boxes using Color class colors for the background.
            // Spanish: Las cajas usan los colores de la clase Color para el fondo.
            R.id.box_one_text -> view.setBackgroundColor(randomColor())
            R.id.box_two_text -> view.setBackgroundColor(randomColor())
            R.id.box_three_text -> view.setBackgroundColor(randomColor())
            R.id.box_four_text -> view.setBackgroundColor(randomColor())
            R.id.box_five_text -> view.setBackgroundColor(randomColor())
            else -> view.setBackgroundColor(randomColor())
        }
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
        val item = (1..10).random()

        val color = when (item) {
            1 -> Color.DKGRAY
            2 -> Color.GRAY
            3 -> Color.BLUE
            4 -> Color.MAGENTA
            5 -> Color.BLUE
            6 -> Color.BLACK
            7 -> Color.GREEN
            8 -> Color.RED
            9 -> Color.YELLOW
            10 -> Color.GRAY
            else -> Color.WHITE
        }
        return color
    }
}