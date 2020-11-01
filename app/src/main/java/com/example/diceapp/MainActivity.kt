package com.example.diceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
      lateinit var image_view : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val RollButton : Button = findViewById(R.id.roll_button)
        //RollButton.text("Let's Roll")
        RollButton.setOnClickListener{
            RollDice()
        }
         image_view = findViewById(R.id.Dice_Image)
    }

    private fun RollDice() {

       val randomInt = Random().nextInt(6)+1

        val DrawableRessource = when(randomInt) {
            1-> R.drawable.dice_1
            2-> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5-> R.drawable.dice_5
            else-> R.drawable.dice_6
        }
        image_view.setImageResource(DrawableRessource)



    }
}
