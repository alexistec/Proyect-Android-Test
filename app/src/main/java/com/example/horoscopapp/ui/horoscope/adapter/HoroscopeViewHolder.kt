package com.example.horoscopapp.ui.horoscope.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.horoscopapp.databinding.ItemHoroscopeBinding
import com.example.horoscopapp.domain.model.HoroscopeInfo

class HoroscopeViewHolder(view:View): RecyclerView.ViewHolder(view) {

    private val binding = ItemHoroscopeBinding.bind(view)
    fun render(horoscopeInfo: HoroscopeInfo){
        val context = binding.titleTextView.context
        binding.imgHoroscope.setImageResource(horoscopeInfo.img)
        binding.titleTextView.text = context.getString(horoscopeInfo.name)
    }
}