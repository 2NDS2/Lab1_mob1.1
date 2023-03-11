package com.example.lab_final_ver


import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatViewInflater
import com.example.lab_final_ver.databinding.FragmentAppBinding

class AppFragment : Fragment() {
    private lateinit var binding: FragmentAppBinding
    private lateinit var context: Context

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentAppBinding.inflate(inflater, container, false)
        context = requireContext()

         fun onClickGoActivity(view: View){
             val intent = Intent(context, DetailActivity::class.java)
                 startActivity(intent)
         }
        return binding.root
    }
}