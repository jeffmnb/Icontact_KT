package com.example.icontact.Welcome_Screen

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.icontact.MainActivity
import com.example.icontact.R
import com.example.icontact.databinding.FragmentWelcome2Binding

class Welcome2FragmentActivity : Fragment() {

    private lateinit var binding: FragmentWelcome2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWelcome2Binding.inflate(inflater, container, false)

        // recuperando nossos componentes da Fragment
        val StartButton = binding.startButton
        val ImageView = binding.imageView
        val TextView = binding.textView

        StartButton.setOnClickListener {
            // intent - "Intenção", é usado para iniciar uma nova atividade no Android
            // nesse caso, estamos usando para levar a uma nova tela

            // setando que a nossa intenção é levar para "MainActivity"
            val intent = Intent(context, MainActivity::class.java)

            //limpando todas as telas da pilha
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }

        return binding.root
    }

}
