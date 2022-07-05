package com.example.petmilyandroid.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.petmilyandroid.R
import com.example.petmilyandroid.databinding.ActivityMainBinding
import com.example.petmilyandroid.ui.main.communication.CommunicationFragment
import com.example.petmilyandroid.ui.main.home.HomeFragment
import com.example.petmilyandroid.ui.main.info.InfoFragment
import com.example.petmilyandroid.ui.main.profile.ProfileFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initBottomNavigation()
    }

    private fun initBottomNavigation(){

        supportFragmentManager.beginTransaction()
            .replace(R.id.main_frm, HomeFragment())
            .commitAllowingStateLoss()

        binding.navView.setOnItemSelectedListener{ item ->
            when (item.itemId) {

                R.id.navigation_home -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_frm, HomeFragment())
                        .commitAllowingStateLoss()
                    return@setOnItemSelectedListener true
                }

                R.id.navigation_communication -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_frm, CommunicationFragment())
                        .commitAllowingStateLoss()
                    return@setOnItemSelectedListener true
                }
                R.id.navigation_info -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_frm, InfoFragment())
                        .commitAllowingStateLoss()
                    return@setOnItemSelectedListener true
                }
                R.id.navigation_profile-> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_frm, ProfileFragment())
                        .commitAllowingStateLoss()
                    return@setOnItemSelectedListener true
                }
            }
            false
        }
    }
}