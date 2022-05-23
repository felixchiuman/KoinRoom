package com.felix.koinroom.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.felix.koinroom.data.room.Database
import com.felix.koinroom.data.room.Entity
import com.felix.koinroom.databinding.ActivityMainBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val viewModel: MainActivityViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnInput.setOnClickListener {
            val newEntity = Entity(
                name = binding.etName.text.toString(),
                age = binding.etAge.text.toString(),
            )
            viewModel.insert(newEntity)
        }
    }
}