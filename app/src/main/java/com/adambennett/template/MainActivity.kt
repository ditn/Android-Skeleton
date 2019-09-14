package com.adambennett.template

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import com.adambennett.moduleandroid.AndroidModuleClass
import com.adambennett.modulekotlin.KotlinModuleClass
import com.adambennett.template.databinding.ActivityMainBinding
import com.adambennett.template.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState == null) {
            supportFragmentManager.commit {
                replace(R.id.container, MainFragment.newInstance())
            }
        }

        // Verify new binding API is working
        checkNotNull(binding.container)

        // Ensure module dependencies are working
        KotlinModuleClass()
        AndroidModuleClass()
    }
}
