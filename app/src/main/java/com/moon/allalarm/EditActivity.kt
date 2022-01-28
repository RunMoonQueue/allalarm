package com.moon.allalarm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.moon.allalarm.databinding.ActivityEditBinding

class EditActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEditBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.option.setOnClickListener {
            Log.i("MQ!", "option")
            binding.optionLayout.visibility = View.VISIBLE
            binding.vibrationLayout.visibility = View.GONE
        }
        binding.vibration.setOnClickListener {
            Log.i("MQ!", "vibration")
            binding.vibrationLayout.visibility = View.VISIBLE
            binding.optionLayout.visibility = View.GONE
        }
    }
}
