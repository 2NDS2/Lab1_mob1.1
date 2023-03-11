package com.example.lab_final_ver

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.lab_final_ver.databinding.FragmentGamesBinding


class gamesFragment : Fragment() {

    private lateinit var binding: FragmentGamesBinding

    private lateinit var context1: Context

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentGamesBinding.inflate(inflater, container, false)
        context1 = requireContext()

        binding.buttonYz.setOnClickListener {
            Toast.makeText(context1,"я хотел что бы эта кнопка работала, но она не хотела работать", Toast.LENGTH_LONG).show()
        }
        return binding.root
    }

}