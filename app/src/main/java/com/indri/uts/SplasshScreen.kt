package com.indri.uts

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SplasshScreen : AppCompatActivity() {

        private lateinit var btnlogin: Button
        private lateinit var btnsign: Button

        override fun onCreate(savedInstanceState: Bundle?) {

            super.onCreate(savedInstanceState)
            enableEdgeToEdge()
            setContentView(R.layout.activity_splassh_screen)


            btnlogin = findViewById(R.id.btnmkn)
            btnsign = findViewById(R.id.btnsign)

            btnlogin.setOnClickListener {
                val intent = Intent(this, PageLogin::class.java)
                startActivity(intent)

                btnsign.setOnClickListener {
                    val intent = Intent(this, PageSignup::class.java)
                    startActivity(intent)



                    ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
                        val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                        v.setPadding(
                            systemBars.left,
                            systemBars.top,
                            systemBars.right,
                            systemBars.bottom
                        )
                        insets
                    }
                }
            }
        }
    }