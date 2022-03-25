package com.samdevit.efittingku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class Mainsplash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainsplash)

        supportActionBar?.hide()

        Handler().postDelayed({
            val intent = Intent(this@Mainsplash, MainMenu::class.java)
            startActivity(intent)
            finish()
        }, 2000)
    }
}