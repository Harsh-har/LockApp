package com.example.lockapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.lockapp.databinding.ActivityLockBinding

class LockActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLockBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding=ActivityLockBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnNext.setOnClickListener({
            startActivity(Intent(this,PatternActivity::class.java))
        })

    }
}