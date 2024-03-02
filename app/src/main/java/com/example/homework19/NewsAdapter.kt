package com.example.homework19

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.homework19.databinding.NewsWindowBinding

class NewsAdapter : RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {
    var newsList: List<News>? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsAdapter.NewsViewHolder {
        return NewsViewHolder(
            NewsWindowBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return newsList!!.size
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        holder.binding.tvText.text=newsList!![position].text
        holder.binding.tvHeader.text=newsList!![position].header
    }

    inner class NewsViewHolder(val binding: NewsWindowBinding) :
        RecyclerView.ViewHolder(binding.root)

}