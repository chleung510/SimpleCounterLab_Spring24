package com.example.simplecounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    // var is for variable that would change
    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Get references of the views
        val addButton = findViewById<Button>(R.id.addButton)
        val textView = findViewById<TextView>(R.id.textView)
        val upgradeBtn = findViewById<Button>(R.id.upgradeBtn)

        addButton.setOnClickListener{
            counter++
            // set counter to String and assign to textView
            textView.text = counter.toString()

            if (counter >= 100){
                upgradeBtn.visibility = View.VISIBLE
                upgradeBtn.setOnClickListener{
                    addButton.setOnClickListener{
                        counter += 2
                        // set counter to String and assign to textView
                        textView.text = counter.toString()
                    }
                    // Hide upgrade button again
                    upgradeBtn.visibility = View.INVISIBLE
                }
            }
        }
    }
}