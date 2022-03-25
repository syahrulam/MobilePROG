package com.samdevit.myuas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Login : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnIntent : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnIntent = findViewById(R.id.buttonNext)
        btnIntent.setOnClickListener(this)


    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.buttonNext -> run{
                val intentBiasa = Intent(this@Login, MainActivity::class.java)
                startActivity(intentBiasa)
            }
        }
    }
}