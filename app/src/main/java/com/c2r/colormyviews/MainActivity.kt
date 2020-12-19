package com.c2r.colormyviews

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.c2r.colormyviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setListeners()
    }

    private fun makeColored() = with(binding) {
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
        constraintLayout.setBackgroundColor(randomColor())
    }

    private fun setListeners() = with(binding) {

        val clickableViews: List<View> =
            listOf(boxOneText, boxTwoText,
                boxThreeText, boxFourText,
                boxFiveText, boxSixText,
                boxSevenText, boxEightText,
                boxNineText, boxTenText,
                boxElevenText, boxTwelveText,
                boxThreetenText, boxFourtenText, constraintLayout)

        for (click in clickableViews) {
            click.setOnClickListener { makeColored() }
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