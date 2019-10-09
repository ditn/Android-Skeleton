package com.adambennett.template.ui.main

import android.content.Context
import android.util.Log
import androidx.fragment.app.viewModels
import com.adambennett.template.databinding.FragmentMainBinding
import com.adambennett.template.ui.BaseFragment
import com.adambennett.template.di.ViewModelFactory
import dagger.Lazy
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

class MainFragment : BaseFragment<FragmentMainBinding>() {

    override val binding: FragmentMainBinding
        get() = FragmentMainBinding.inflate(layoutInflater)

    @Inject
    lateinit var factory: ViewModelFactory

    private val viewModel: MainViewModel by viewModels(factoryProducer = { factory })

    override fun onAttach(context: Context) {
        super.onAttach(context)

        viewModel.bind()
    }

    companion object {

        fun newInstance() = MainFragment()
    }
}
