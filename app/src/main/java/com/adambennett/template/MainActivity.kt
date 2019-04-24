package com.adambennett.template

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commitNow
import com.adambennett.moduleandroid.AndroidModuleClass
import com.adambennett.modulekotlin.KotlinModuleClass
import com.adambennett.template.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.commitNow {
                replace(R.id.container, MainFragment.newInstance())
            }
        }

        // Ensure module dependencies are working
        KotlinModuleClass()
        AndroidModuleClass()
    }
}
