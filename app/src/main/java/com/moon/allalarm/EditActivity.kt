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

        binding.sunday.setOnClickListener {
            binding.sunday.isShowOutline = !binding.sunday.isShowOutline;
        }
        binding.monday.setOnClickListener {
            binding.monday.isShowOutline = !binding.monday.isShowOutline;
        }
        binding.tuesday.setOnClickListener {
            binding.tuesday.isShowOutline = !binding.tuesday.isShowOutline;
        }
        binding.wednesday.setOnClickListener {
            binding.wednesday.isShowOutline = !binding.wednesday.isShowOutline;
        }
        binding.thursday.setOnClickListener {
            binding.thursday.isShowOutline = !binding.thursday.isShowOutline;
        }
        binding.friday.setOnClickListener {
            binding.friday.isShowOutline = !binding.friday.isShowOutline;
        }
        binding.saturday.setOnClickListener {
            binding.saturday.isShowOutline = !binding.saturday.isShowOutline;
        }
    }
}
