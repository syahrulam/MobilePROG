package com.vyw.tflite

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.vyw.tflite.databinding.ActivityMainLaporkanBinding

class Mainlaporkan : AppCompatActivity() {

    lateinit var binding : ActivityMainLaporkanBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainLaporkanBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.kirimemail.setOnClickListener{

            val email = binding.emailAddress.text.toString()
            val subject = binding.subject.text.toString()
            val pesan = binding.message.text.toString()

            val addresses = email.split(",".toRegex()).toTypedArray()
            val intent = Intent(Intent.ACTION_SENDTO).apply{
                data = Uri.parse("mailto:")
                putExtra(Intent.EXTRA_EMAIL,addresses)
                putExtra(Intent.EXTRA_SUBJECT,subject)
                putExtra(Intent.EXTRA_TEXT,pesan)
            }
            if (intent.resolveActivity(packageManager) != null){
                startActivity(intent)
            }else{
                Toast.makeText(this@Mainlaporkan, "Gmail tidak terpasang",Toast.LENGTH_SHORT).show()
                
            }
        }

    }
}