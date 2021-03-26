package com.csclub.chessdictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.csclub.chessdictionary.databinding.ActivityRookBinding

class RookActivity : AppCompatActivity() {

    lateinit var binding: ActivityRookBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Create the binding from the layout
        binding = ActivityRookBinding.inflate(layoutInflater)

        //Set the content view
        setContentView(binding.root)

        //Set the switch state change listener
        binding.rookImageSwitch.setOnCheckedChangeListener { _, checked ->

            //If the switch is on...
            if (checked) {

                //Make the image visible
                binding.rookImage?.visibility  = View.VISIBLE

            }

            //Otherwise...
            else {

                //Make the image invisible
                binding.rookImage?.visibility = View.GONE

            }

        }

    }

}