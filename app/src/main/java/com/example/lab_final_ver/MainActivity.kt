package com.example.lab_final_ver

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.lab_final_ver.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(gamesFragment())

        binding.bottomNav.setOnItemSelectedListener {
            when(it.itemId){
                R.id.games -> replaceFragment(gamesFragment())
                R.id.app -> replaceFragment(AppFragment())
                R.id.movies -> replaceFragment(moviesFragment())
                R.id.books -> replaceFragment(booksFragment())
                else ->{}
            }
            true
        }
    }

    private fun replaceFragment(fragment : Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout,fragment)
        fragmentTransaction.commit()
    }


}

