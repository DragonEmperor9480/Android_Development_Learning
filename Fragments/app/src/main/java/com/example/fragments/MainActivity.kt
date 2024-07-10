package com.example.fragments

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        openFragment(FirstFragment())
        val bottom_nav : BottomNavigationView = findViewById(R.id.bottom_nav)

        bottom_nav.setOnNavigationItemSelectedListener {
            val id = it.itemId
            when(id)
            {
                R.id.item_home->{
                    openFragment(FirstFragment())
                }
                R.id.item_profile->{
                    openFragment(SecondFragment())
                }
                R.id.item_cart->{
                    openFragment(ThirdFragment())
                }
            }
            return@setOnNavigationItemSelectedListener true
        }

//        val btn : Button = findViewById(R.id.btn)
//
//        btn.setOnClickListener {
//            supportFragmentManager.beginTransaction()
//                .replace(R.id.fcv, FirstFragment())
//                .commit()
//
//        }

    }

    private  fun openFragment(fragment: Fragment)
    {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fcv,fragment)
            .commit()
    }
}