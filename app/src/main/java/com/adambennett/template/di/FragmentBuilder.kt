package com.adambennett.template.di

import com.adambennett.template.ui.main.MainFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBuilder {

    @ContributesAndroidInjector
    abstract fun contributeMainFragment(): MainFragment
}
