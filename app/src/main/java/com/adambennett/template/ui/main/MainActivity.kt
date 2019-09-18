package com.adambennett.template.ui.main

import android.os.Bundle
import androidx.fragment.app.commit
import com.adambennett.moduleandroid.AndroidModuleClass
import com.adambennett.modulekotlin.KotlinModuleClass
import com.adambennett.template.R
import com.adambennett.template.databinding.ActivityMainBinding
import com.adambennett.template.ui.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override val binding: ActivityMainBinding
        get() = ActivityMainBinding.inflate(layoutInflater)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

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
