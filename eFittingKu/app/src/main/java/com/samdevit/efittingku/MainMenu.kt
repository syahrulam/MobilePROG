package com.samdevit.efittingku

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainMenu : AppCompatActivity(){

    private lateinit var btnLaporkan: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        btnLaporkan = findViewById(R.id.btnlaporkan)

        btnLaporkan.setOnClickListener{
            val emailIntent = Intent(Intent.ACTION_SENDTO,Uri.fromParts("mailto","efittingkuofficial@gmail.com", null))
            startActivity(Intent.createChooser(emailIntent,"Send email..."))
        }

        // Example of a call to a native method

    }

    fun btnCamera_click(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
    fun btnBot_click(view: View) {
        val intent = Intent(this, MainBot::class.java)
        startActivity(intent)
    }
    fun btnBot_hasil(view: View) {
        val intent = Intent(this, com.samdevit.efittingku.api.MainActivity::class.java)
        startActivity(intent)
    }
    //   fun btnView_click(view: View) {
    //     val intent = Intent(this, MainActivity::class.java)
    //      startActivity(intent)
    //  }

}