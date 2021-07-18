package com.sisco.moveanimation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sisco.moveanimation.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        binding.btn2.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
        }
    }
}