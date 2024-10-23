package com.indri.uts

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Detail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val imageView5: ImageView = findViewById(R.id.imageView5)
        val detailTitleTextView: TextView = findViewById(R.id.detailTitleTextView)
        val commentEditText: EditText = findViewById(R.id.commentEditText)
        val button2: Button = findViewById(R.id.button2)
        val btn1: Button = findViewById(R.id.btn1)

        // Get the data passed from the main activity
        val title = intent.getStringExtra("TITLE")
        val imageResId = intent.getIntExtra("IMAGE_RES_ID", R.drawable.img)

        // Set the data to the views
        detailTitleTextView.text = title
        imageView5.setImageResource(imageResId)

        button2.setOnClickListener {
            finish() // Close the activity
        }

        btn1.setOnClickListener {
            finish() // Close the activity
        }

    }
}