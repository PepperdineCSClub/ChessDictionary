package com.csclub.chessdictionary

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.csclub.chessdictionary.databinding.ActivityMainBinding

class QueenActivity : AppCompatActivity() {
    lateinit var binding: ActivityQueenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQueenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setContentView(R.layout.activity_queen)
        setSupportActionBar(findViewById(R.id.toolbar))

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }
}