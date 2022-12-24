package com.jasonchen.gogolooksearch.view.ui.main

import android.content.Intent
import android.net.Uri
import android.util.Log
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View.*
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
import com.jasonchen.gogolooksearch.Constants
import com.jasonchen.gogolooksearch.Constants.ResultLayoutType
import com.jasonchen.gogolooksearch.Constants.ResultLayoutType.*
import com.jasonchen.gogolooksearch.data.model.searchImages.Hit
import com.jasonchen.gogolooksearch.databinding.FragmentSearchBinding
import com.jasonchen.gogolooksearch.utils.AppUtils.setSafeOnClickListener
import com.jasonchen.gogolooksearch.view.base.BaseFragment
import com.jasonchen.gogolooksearch.view.ui.MainViewModel
import com.jasonchen.gogolooksearch.view.ui.main.history.SearchHistoryAdapter
import com.jasonchen.gogolooksearch.view.ui.main.history.SearchHistoryAdapterCallback
import com.jasonchen.gogolooksearch.view.ui.main.result.SearchResultAdapter
import com.jasonchen.gogolooksearch.view.ui.main.result.SearchResultAdapterCallback

class SearchFragment : BaseFragment<FragmentSearchBinding>() {
    private val DEF_LAYOUT_GRID_TYPE_COLUMN = 2

    companion object {
        fun newInstance() = SearchFragment()
    }

    override fun bindingInflater(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentSearchBinding {
        return FragmentSearchBinding.inflate(inflater, container, false)
    }

    private val viewModel by activityViewModels<MainViewModel> { factory }

    override fun initView() {
        subscribesResultLayoutType()
        subscribesSearchState()
        subscribesSearchHistory()

        initHistoryRecyclerView()

        binding.edittextKeyword.setSafeOnClickListener {
            showHistoryRecyclerView(true)
        }

        binding.buttonSearch.setSafeOnClickListener {
            showHistoryRecyclerView(false)
            viewModel.searchImages(binding.edittextKeyword.text.toString(), true)
        }

        binding.imageviewPixabayLogo.setSafeOnClickListener {
            showHistoryRecyclerView(false)
            openExternalWebSite(Constants.WEB_URL_PIXABAY)
        }
    }

    private fun subscribesSearchState() {
        viewModel.searchState.observe(viewLifecycleOwner) { state ->
            val adapter = binding.pageResult.recyclerviewResult.adapter as SearchResultAdapter
            when (state) {
                MainViewModel.SearchInitial -> {
                    binding.progressBar.visibility = GONE
                    binding.pageNoResult.root.visibility = VISIBLE
                    binding.pageResult.root.visibility = GONE
                }
                MainViewModel.SearchLoading -> {
                    binding.progressBar.visibility = VISIBLE
                }
                is MainViewModel.SearchError -> {
                    binding.progressBar.visibility = GONE

                    val errorCode = if (state.errorCode.isNotEmpty()) "(${state.errorCode})" else ""
                    showErrorMsg("$errorCode ${state.errorMsg}")
                }
                is MainViewModel.SearchSuccess -> {
                    binding.progressBar.visibility = GONE
                    binding.pageNoResult.root.visibility = GONE
                    binding.pageResult.root.visibility = VISIBLE
                    adapter.submitList(state.hits)
                }
            }
        }
    }

    private fun subscribesResultLayoutType() {
        viewModel.resultLayoutType.observe(viewLifecycleOwner) { type ->
            initRecyclerView(type, getLayoutManager(type))
        }
    }

    private fun subscribesSearchHistory() {
        viewModel.searchHistory.observe(viewLifecycleOwner) { history ->
            val reverseHistory = mutableListOf<String>()
            reverseHistory.addAll(history)
            reverseHistory.reverse()
            val adapter = binding.recyclerviewSearchHistory.adapter as SearchHistoryAdapter
            adapter.submitList(reverseHistory)
        }
    }

    private fun initRecyclerView(type: ResultLayoutType, layoutManager: LayoutManager) {
        binding.pageResult.recyclerviewResult.layoutManager = layoutManager
        binding.pageResult.recyclerviewResult.addOnItemTouchListener(object : OnItemTouchListener {
            override fun onInterceptTouchEvent(rv: RecyclerView, e: MotionEvent): Boolean {
                showHistoryRecyclerView(false)
                return false
            }

            override fun onTouchEvent(rv: RecyclerView, e: MotionEvent) {

            }

            override fun onRequestDisallowInterceptTouchEvent(disallowIntercept: Boolean) {

            }
        })
        val adapter = SearchResultAdapter(type, viewModel, object : SearchResultAdapterCallback {
            override fun onItemSelect(position: Int, hit: Hit) {
                openExternalWebSite(hit.pageURL)
            }

            override fun preLoadNextPage() {
                viewModel.searchImages(isNewSearch = false)
            }
        })
        binding.pageResult.recyclerviewResult.adapter = adapter

        adapter.submitList(viewModel.hits)
    }

    private fun initHistoryRecyclerView() {
        binding.recyclerviewSearchHistory.layoutManager = LinearLayoutManager(context)
        val adapter = SearchHistoryAdapter(object : SearchHistoryAdapterCallback {
            override fun onItemSelect(position: Int, keyword: String) {
                binding.edittextKeyword.setText(keyword)
                viewModel.searchImages(keyword, true)
            }
        })
        binding.recyclerviewSearchHistory.adapter = adapter
    }

    private fun showHistoryRecyclerView(isShow: Boolean) {
        if (isShow) {
            binding.recyclerviewSearchHistory.visibility = VISIBLE
        } else {
            binding.recyclerviewSearchHistory.visibility = GONE
        }
    }

    private fun getLayoutManager(type: ResultLayoutType): LayoutManager {
        return when (type) {
            LIST -> {
                LinearLayoutManager(context)
            }
            else -> {
                GridLayoutManager(context, DEF_LAYOUT_GRID_TYPE_COLUMN)
            }
        }
    }

    private fun openExternalWebSite(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }
}