package com.example.pertemuanx

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainRegister : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnRegister : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btnRegister = findViewById(R.id.btnregister)
        btnRegister.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id){
                R.id.btnregister ->{
                    val intentBiasa = Intent (this@MainRegister, hasilregister::class.java)
                    startActivity(intentBiasa)
                }
            }
        }
    }
}