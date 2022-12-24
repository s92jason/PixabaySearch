package com.jasonchen.gogolooksearch.view.ui

import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import android.view.Menu
import android.view.MenuItem
import androidx.activity.viewModels
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import com.jasonchen.gogolooksearch.Constants
import com.jasonchen.gogolooksearch.Constants.ResultLayoutType.*
import com.jasonchen.gogolooksearch.R
import com.jasonchen.gogolooksearch.databinding.ActivityMainBinding
import com.jasonchen.gogolooksearch.utils.SharedPrefUtil
import com.jasonchen.gogolooksearch.view.base.BaseActivity
import javax.inject.Inject

class MainActivity : BaseActivity<ActivityMainBinding>() {
    private val viewModel by viewModels<MainViewModel> { factory }

    private val navController by lazy {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentContainer) as NavHostFragment
        navHostFragment.navController
    }

    override fun setViewBinding(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

//    override fun onSupportNavigateUp(): Boolean {
//        val navController = findNavController(R.id.nav_host_fragment_content_main)
//        return navController.navigateUp(appBarConfiguration)
//                || super.onSupportNavigateUp()
//    }

    override fun initView() {
        subscribesResultLayoutType()

        viewModel.resultLayoutType.value?.let { setFabImage(it) }

        binding.fab.setOnClickListener { view ->
            viewModel.switchResultLayoutType()
        }
    }

    private fun subscribesResultLayoutType() {
        viewModel.resultLayoutType.observe(this) { type ->
            setFabImage(type)
        }
    }

    private fun setFabImage(type: Constants.ResultLayoutType) {
        when(type) {
            LIST -> {
                binding.fab.setImageResource(R.drawable.ic_baseline_format_list_bulleted_24)
            }
            else -> {
                binding.fab.setImageResource(R.drawable.ic_baseline_view_grid_24)
            }
        }
    }
}