package me.dio.sportheca.simulator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import me.dio.sportheca.simulator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        setContentView(R.layout.activity_main)
//        val tvHello = findViewById<TextView>(R.id.tvHello)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}