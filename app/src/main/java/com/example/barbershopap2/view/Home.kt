package com.example.barbershopap2.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.barbershopap2.R
import com.example.barbershopap2.adapter.ServicosAdapter
import com.example.barbershopap2.databinding.ActivityHome2Binding
import com.example.barbershopap2.model.Servicos

class Home : AppCompatActivity() {

    private lateinit var binding: ActivityHome2Binding
    private lateinit var servicosAdapter: ServicosAdapter
    private val listaServicos: MutableList<Servicos> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHome2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()
        val nome = intent.extras?.getString("nome")

        binding.txtNomeUsuario.text = "Bem vindo, $nome"
        val recyclerViewServicos = binding.recylerViewservicos
        recyclerViewServicos.layoutManager = GridLayoutManager(this,2)
        servicosAdapter = ServicosAdapter(this, listaServicos)
        recyclerViewServicos.setHasFixedSize(true)
        recyclerViewServicos.adapter = servicosAdapter
        getServicos()

        binding.btAgendar.setOnClickListener{
            val intent = Intent(this, Agendamento::class.java)
            intent.putExtra("nome", nome)
            startActivity(intent)

        }

    }

    private fun getServicos(){

        val servico1 = Servicos(R.drawable.img1,"Corte de cabelo")
        listaServicos.add(servico1)

        val servico2 = Servicos(R.drawable.img2,"Corte de barba")
        listaServicos.add(servico2)

        val servico3 = Servicos(R.drawable.img3,"Lavagem de cabelo")
        listaServicos.add(servico3)

        val servico4 = Servicos(R.drawable.img4,"Tratamento de cabelo")
        listaServicos.add(servico4)

    }

}