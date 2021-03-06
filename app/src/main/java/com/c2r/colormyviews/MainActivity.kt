package com.c2r.colormyviews

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    private fun makeColored(view: View) {

            when (view.id) {
                R.id.box_one_text -> changeAllColor()
                R.id.box_two_text -> changeAllColor()
                R.id.box_three_text -> changeAllColor()
                R.id.box_four_text -> changeAllColor()
                R.id.box_five_text -> changeAllColor()
                R.id.box_six_text -> changeAllColor()
                R.id.box_seven_text -> changeAllColor()
                R.id.box_eight_text -> changeAllColor()
                R.id.box_nine_text -> changeAllColor()
                R.id.box_ten_text -> changeAllColor()
                R.id.box_eleven_text -> changeAllColor()
                R.id.box_twelve_text -> changeAllColor()
                R.id.box_threeten_text -> changeAllColor()
                R.id.box_fourten_text -> changeAllColor()
                R.id.constraint_layout -> changeAllColor()
                else -> Toast.makeText(this, "Oprime en una figura", Toast.LENGTH_SHORT).show()
            }

    }

    private fun setListeners() {

        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)
        val boxSixText = findViewById<TextView>(R.id.box_six_text)
        val boxSevenText = findViewById<TextView>(R.id.box_seven_text)
        val boxEightText = findViewById<TextView>(R.id.box_eight_text)
        val boxNineText = findViewById<TextView>(R.id.box_nine_text)
        val boxTenText = findViewById<TextView>(R.id.box_ten_text)
        val boxElevenText = findViewById<TextView>(R.id.box_eleven_text)
        val boxTwelveText = findViewById<TextView>(R.id.box_twelve_text)
        val boxThreetenText = findViewById<TextView>(R.id.box_threeten_text)
        val boxFourtenText = findViewById<TextView>(R.id.box_fourten_text)
        val constLayout = findViewById<View>(R.id.constraint_layout)

        val clickableViews: List<View> =
            listOf(boxOneText,
                boxTwoText, boxThreeText,
                boxFourText, boxFiveText,
                boxSixText, boxSevenText,
                boxEightText, boxNineText,
                boxTenText, boxElevenText,
                boxTwelveText, boxThreetenText,
                boxFourtenText, constLayout)

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

    private fun changeAllColor() {
        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)
        val boxSixText = findViewById<TextView>(R.id.box_six_text)
        val boxSevenText = findViewById<TextView>(R.id.box_seven_text)
        val boxEightText = findViewById<TextView>(R.id.box_eight_text)
        val boxNineText = findViewById<TextView>(R.id.box_nine_text)
        val boxTenText = findViewById<TextView>(R.id.box_ten_text)
        val boxElevenText = findViewById<TextView>(R.id.box_eleven_text)
        val boxTwelveText = findViewById<TextView>(R.id.box_twelve_text)
        val boxThreetenText = findViewById<TextView>(R.id.box_threeten_text)
        val boxFourtenText = findViewById<TextView>(R.id.box_fourten_text)
        val constLayout = findViewById<View>(R.id.constraint_layout)

        boxOneText.setBackgroundColor(randomColor())
        boxTwoText.setBackgroundColor(randomColor())
        boxThreeText.setBackgroundColor(randomColor())
        boxFourText.setBackgroundColor(randomColor())
        boxFiveText.setBackgroundColor(randomColor())
        boxSixText.setBackgroundColor(randomColor())
        boxSevenText.setBackgroundColor(randomColor())
        boxEightText.setBackgroundColor(randomColor())
        boxNineText.setBackgroundColor(randomColor())
        boxTenText.setBackgroundColor(randomColor())
        boxElevenText.setBackgroundColor(randomColor())
        boxTwelveText.setBackgroundColor(randomColor())
        boxThreetenText.setBackgroundColor(randomColor())
        boxFourtenText.setBackgroundColor(randomColor())
        constLayout.setBackgroundColor(randomColor())
    }
}