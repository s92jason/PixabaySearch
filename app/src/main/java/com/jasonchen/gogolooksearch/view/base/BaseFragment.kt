package com.jasonchen.gogolooksearch.view.base

import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import androidx.viewbinding.ViewBinding
import com.google.android.material.snackbar.Snackbar
import com.jasonchen.gogolooksearch.di.Injectable
import javax.inject.Inject

abstract class BaseFragment<VB : ViewBinding> : Fragment(), Injectable {
    @Inject
    protected lateinit var factory: ViewModelProvider.Factory

    protected lateinit var binding: VB

    protected val navController by lazy { NavHostFragment.findNavController(this) }

    protected abstract fun bindingInflater(inflater: LayoutInflater, container: ViewGroup?): VB

    protected abstract fun initView()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = bindingInflater(inflater, container)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    protected fun showErrorMsg(msg: String) {
        if (msg.isEmpty()) {
            return
        }
        Snackbar.make(binding.root, msg, Snackbar.LENGTH_LONG).show();
    }
}