package com.moon.allalarm

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.moon.allalarm.databinding.ActivityEditBinding

class EditActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEditBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityEditBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initView()
    }


    private fun initView() {
        binding.plan.setOnClickListener {
            binding.planLayout.visibility = View.VISIBLE
            binding.vibrationLayout.visibility = View.GONE
        }

        binding.vibration.setOnClickListener {
            binding.planLayout.visibility = View.GONE
            binding.vibrationLayout.visibility = View.VISIBLE
        }
    }
}