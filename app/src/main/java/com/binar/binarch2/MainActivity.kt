package com.binar.binarch2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.TextView
import android.widget.Toast
import com.binar.binarch2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var tvHelloWorld: TextView? = null

    // 1. Declare Binding
    private var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 2. Inisiasi Bindingnya
        binding = ActivityMainBinding.inflate(layoutInflater)

        // setContentView(R.layout.activity_main)
        // 3. Ganti nama layout menjadi binding.root
        setContentView(binding?.root)
        setTextHello()
    }

    private fun setTextHello() {
        // Old Way
        // tvHelloWorld = findViewById(R.id.tv_hello_world)
        // tvHelloWorld?.text = "Konnichiwa"
        // Toast.makeText(this,tvHelloWorld?.text, Toast.LENGTH_SHORT).show()

        // use view binding
        binding?.tvHelloWorld?.text = "Konnichiwa wawa"

    }
}