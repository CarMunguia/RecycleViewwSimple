package com.example.recycleviewsimple

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleviewsimple.databinding.ItemPlantillaBinding
import org.json.JSONObject

class MainAdapter(private val videos: Array<JSONObject>): RecyclerView.Adapter<MainAdapter.MainHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainAdapter.MainHolder {
        val binding = ItemPlantillaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MainHolder(binding)
    }

    override fun onBindViewHolder(holder: MainAdapter.MainHolder, position: Int) {
        holder.render(videos[position])
    }

    override fun getItemCount(): Int {

        return videos.size
    }

    class MainHolder(val binding:ItemPlantillaBinding): RecyclerView.ViewHolder(binding.root) {
        fun render(video: JSONObject) {
//TODDO assign text and image values in render function
            binding.tvVideoTitle.setText(video.getString("title"))
            binding.tvChannelName.setText(video.getString("channel"))
            binding.tvVideoViews.setText(video.getString("views"))
            binding.tvDatePosted.setText(video.getString("datePosted"))
            binding.tvVideoDuration.setText(video.getString("duration"))
            binding.ivVideoThumbnail.setImageResource(R.drawable.camara_icon)
            binding.ivAvatar.setImageResource(R.drawable.person_icon)
        }
    }


}