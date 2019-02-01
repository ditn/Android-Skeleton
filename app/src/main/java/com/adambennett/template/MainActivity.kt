package com.adambennett.template

import android.os.Bundle
import androidx.annotation.ContentView
import androidx.appcompat.app.AppCompatActivity
import com.adambennett.moduleandroid.AndroidModuleClass
import com.adambennett.modulekotlin.KotlinModuleClass
import com.adambennett.template.ui.main.MainFragment

@ContentView(R.layout.activity_main)
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }

        // Ensure module dependencies are working
        KotlinModuleClass()
        AndroidModuleClass()
    }
}
