package com.example.busalarm_jeonju

import android.app.Application
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.busalarm_jeonju.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private var mBinding : ActivityMainBinding? = null
    private val binding get() = mBinding!!
    private var bottomNavigationBar : BottomNavigationView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewBinding()
        setBottomNavigation()
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView, fragment).commit()
    }

    private fun setBottomNavigation() {
        binding.bottomNavigationBar.run { setOnNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.action_home -> replaceFragment(HomeFragment())
                R.id.action_searching -> replaceFragment(SearchFragment())
                R.id.action_setting -> replaceFragment(SettingFragment())
            }
            true
        }
            selectedItemId = R.id.action_home
        }
    }

    // view binding을 위한 코드
    private fun viewBinding() {
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    // onDestroy에서 binding class 객체 참조 정리
    override fun onDestroy() {
        mBinding = null
        super.onDestroy()
    }
}