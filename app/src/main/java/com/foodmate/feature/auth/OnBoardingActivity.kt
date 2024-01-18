package com.foodmate.feature.auth

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.foodmate.databinding.ActivityOnBoardingBinding

class OnBoardingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOnBoardingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnBoardingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAuthMitra.setOnClickListener {
            startActivity(Intent(this, InitialActivity::class.java))
        }

        binding.btnAuthUser.setOnClickListener {
            startActivity(Intent(this, InitialActivity::class.java))
        }
    }
}