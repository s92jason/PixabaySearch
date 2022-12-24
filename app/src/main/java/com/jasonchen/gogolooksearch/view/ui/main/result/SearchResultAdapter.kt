package com.jasonchen.gogolooksearch.view.ui.main.result

import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.SCROLL_STATE_IDLE
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.jasonchen.gogolooksearch.Constants
import com.jasonchen.gogolooksearch.Constants.ResultLayoutType.*
import com.jasonchen.gogolooksearch.R
import com.jasonchen.gogolooksearch.data.model.searchImages.Hit
import com.jasonchen.gogolooksearch.databinding.ViewSearchResultGridBinding
import com.jasonchen.gogolooksearch.databinding.ViewSearchResultListBinding
import com.jasonchen.gogolooksearch.utils.AppUtils.setSafeOnClickListener
import com.jasonchen.gogolooksearch.view.ui.MainViewModel
import java.lang.Integer.max

class SearchResultAdapter(
    private val resultLayoutType: Constants.ResultLayoutType,
    private val viewModel: MainViewModel,
    private val callback: SearchResultAdapterCallback
) : ListAdapter<Hit, RecyclerView.ViewHolder>(DiffCallback()) {
    private var scrollState: Int = 0

    companion object {
        private const val DEF_PRELOAD_COUNT = 2
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            LIST.index -> {
                ListViewHolder(
                    ViewSearchResultListBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    )
                )
            }
            else -> {
                GridViewHolder(
                    ViewSearchResultGridBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    )
                )
            }
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        checkLoadNextPage(position)

        val hit = getItem(position)
        if (holder is GridViewHolder) {
            holder.bind(position, hit)
        } else if (holder is ListViewHolder) {
            holder.bind(position, hit)
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when (resultLayoutType) {
            GRID -> GRID.index
            LIST -> LIST.index
        }
    }

    override fun onAttachedToRecyclerView(recyclerView: RecyclerView) {
        recyclerView.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                // 更新滚动状态
                scrollState = newState
                super.onScrollStateChanged(recyclerView, newState)
            }
        })
    }

    private fun checkLoadNextPage(position: Int) {
        if (position == max(itemCount - 1 - DEF_PRELOAD_COUNT, 0) &&
            scrollState != SCROLL_STATE_IDLE &&
            !viewModel.isLoading()
        ) {
            Log.e("TAG", "checkLoadNextPage: preLoadNextPage")
            callback.preLoadNextPage()
        }
    }

    inner class ListViewHolder(private val binding: ViewSearchResultListBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(position: Int, hit: Hit) {
            binding.root.setSafeOnClickListener {
                callback.onItemSelect(position, hit)
            }

            setImage(hit)
            setText(hit)
        }

        private fun setImage(hit: Hit) {
            Glide.with(binding.root.context)
                .load(hit.previewURL)
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .skipMemoryCache(false)
                .centerInside()
                .error(R.drawable.ic_baseline_image_24)
                .into(binding.imageviewPic)
        }

        private fun setText(hit: Hit) {
            binding.textviewPageUrl.text = hit.pageURL
            binding.textviewUser.text = hit.user
        }
    }

    inner class GridViewHolder(private val binding: ViewSearchResultGridBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(position: Int, hit: Hit) {
            binding.root.setSafeOnClickListener {
                callback.onItemSelect(position, hit)
            }

            setImage(hit)
        }

        private fun setImage(hit: Hit) {
            Glide.with(binding.root.context)
                .load(hit.previewURL)
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .skipMemoryCache(false)
                .centerInside()
                .error(R.drawable.ic_baseline_image_24)
                .into(binding.imageviewPic)
        }
    }

    private class DiffCallback : DiffUtil.ItemCallback<Hit>() {
        override fun areItemsTheSame(oldItem: Hit, newItem: Hit): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Hit, newItem: Hit): Boolean {
            return oldItem == newItem
        }
    }
}