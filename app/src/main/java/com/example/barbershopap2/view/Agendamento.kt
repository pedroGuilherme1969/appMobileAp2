package com.example.barbershopap2.view

import android.annotation.SuppressLint
import android.icu.util.Calendar
import android.os.Bundle
import android.os.Build
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.barbershopap2.R
import com.example.barbershopap2.databinding.ActivityAgendamentoBinding

class Agendamento : AppCompatActivity() {

    private lateinit var binding: ActivityAgendamentoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAgendamentoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()
        val nome = intent.extras?.getString("nome").toString()

        val datePicker = binding.datePicker
    }
}
