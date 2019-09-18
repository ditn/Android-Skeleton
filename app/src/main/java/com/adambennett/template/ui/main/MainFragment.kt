package com.adambennett.template.ui.main

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProviders
import com.adambennett.template.databinding.FragmentMainBinding
import com.adambennett.template.ui.BaseFragment

class MainFragment : BaseFragment<FragmentMainBinding>() {

    private lateinit var viewModel: MainViewModel
    override val binding: FragmentMainBinding
        get() = FragmentMainBinding.inflate(layoutInflater)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel
    }

    companion object {

        fun newInstance() = MainFragment()
    }
}
