package com.csclub.chessdictionary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.csclub.chessdictionary.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.goToPawnPageButton.setOnClickListener {
            startActivity(Intent(this, PawnActivity::class.java))
        }

        //Set the 'rook' button onClickListener
        binding.goToRookPageButton.setOnClickListener {

            //Create an intent to open the rook activity
            val rookActivityIntent = Intent(this, RookActivity::class.java)

            //Start the rook activity
            startActivity(rookActivityIntent)

        }
    }
}