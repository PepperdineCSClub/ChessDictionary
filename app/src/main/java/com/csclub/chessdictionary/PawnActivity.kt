package com.csclub.chessdictionary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.csclub.chessdictionary.databinding.ActivityMainBinding

class PawnActivity : AppCompatActivity() {
    lateinit var binding: ActivityPawnBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pawn)

        binding = ActivityPawnBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.goToPawnPageButton.setOnClickListener {
            startActivity(Intent(this, PawnActivity::class.java))
        }
    }
}
However, a pawn that advances all the way to the opposite side of the
board is promoted to another piece of that player's choice