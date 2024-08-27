package com.example.lockapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.lockapp.databinding.ActivityPatternBinding

class PatternActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPatternBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityPatternBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.start.setOnClickListener({
            startActivity(Intent(this,PatterndetailsActivity::class.java))
        })

        }
    }
