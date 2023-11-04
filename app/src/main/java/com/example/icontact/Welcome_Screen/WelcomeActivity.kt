package com.example.icontact.Welcome_Screen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.icontact.R
import com.example.icontact.databinding.ActivityWelcomeBinding
import com.example.icontact.databinding.FragmentWelcome2Binding
import com.google.android.material.tabs.TabLayoutMediator

class WelcomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWelcomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityWelcomeBinding.inflate(layoutInflater)

        setContentView(binding.root)


        val fragmentList = arrayListOf(Welcome1FragmentActivity(), Welcome2FragmentActivity())

        val viewPagerAdapter = WelcomeAdapter(supportFragmentManager, lifecycle, fragmentList)

        binding.welcomeViewPager2.adapter = viewPagerAdapter

        TabLayoutMediator(binding.welcomeTabLayout, binding.welcomeViewPager2) { TabLayoutMediator,  position ->}.attach()
    }
}