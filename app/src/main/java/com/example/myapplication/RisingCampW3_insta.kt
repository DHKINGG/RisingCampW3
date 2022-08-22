package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.myapplication.Fragment.*
import com.example.myapplication.databinding.ActivityRisingCampW3InstaBinding

class RisingCampW3_insta : AppCompatActivity() {
    private lateinit var binding: ActivityRisingCampW3InstaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRisingCampW3InstaBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


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