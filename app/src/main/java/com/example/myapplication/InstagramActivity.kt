package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.myapplication.Fragment.*
import com.example.myapplication.databinding.ActivityInstagramBinding

class InstagramActivity : AppCompatActivity() {
    private lateinit var binding: ActivityInstagramBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInstagramBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // transaction : 작업의 단위
        supportFragmentManager.beginTransaction().add(binding.flInsta.id, HomeFragment()).commit()
        binding.btnNav.setOnNavigationItemSelectedListener {
            replaceFragment(
                when (it.itemId) {
                    R.id.menu_home -> HomeFragment()
                    R.id.menu_search -> SearchFragment()
                    R.id.menu_video -> VideoFragment()
                    R.id.menu_shopping -> ShoppingFragment()
                    else -> MyinfoFragment()

                }
            )
            true
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(binding.flInsta.id, fragment).commit()
    }
}