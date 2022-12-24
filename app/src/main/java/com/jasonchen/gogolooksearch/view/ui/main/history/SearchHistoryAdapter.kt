package com.jasonchen.gogolooksearch.view.ui.main.history

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.jasonchen.gogolooksearch.databinding.ViewSearchHistoryItemBinding
import com.jasonchen.gogolooksearch.utils.AppUtils.setSafeOnClickListener
import com.jasonchen.gogolooksearch.view.ui.main.history.SearchHistoryAdapter.SearchHistoryViewHolder

class SearchHistoryAdapter(private val callback: SearchHistoryAdapterCallback) :
    ListAdapter<String, SearchHistoryViewHolder>(DiffCallback()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchHistoryViewHolder {
        return SearchHistoryViewHolder(
            ViewSearchHistoryItemBinding.inflate(
                LayoutInflater.from(
                    parent.context
                ), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: SearchHistoryViewHolder, position: Int) {
        holder.bind(position, getItem(position))
    }

    inner class SearchHistoryViewHolder(private val binding: ViewSearchHistoryItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int, keyword: String) {
            binding.root.setSafeOnClickListener {
                callback.onItemSelect(position, keyword)
            }

            binding.textviewKeyword.text = keyword
        }
    }

    private class DiffCallback : DiffUtil.ItemCallback<String>() {
        override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
            return oldItem == newItem
        }

        override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
            return oldItem == newItem
        }
    }
}