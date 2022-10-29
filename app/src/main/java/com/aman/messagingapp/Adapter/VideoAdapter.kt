package com.aman.messagingapp.Adapter

import android.media.MediaPlayer
import android.provider.MediaStore.Video
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ProgressBar
import androidx.recyclerview.widget.RecyclerView
import com.aman.messagingapp.R
import com.aman.messagingapp.data.VideoData
import kotlinx.android.synthetic.main.video_rv.view.*

class VideoAdapter(private val video: ArrayList<VideoData>) :
    RecyclerView.Adapter<VideoAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.video_rv, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.setVideoData(video[position])

    }

    override fun getItemCount(): Int {
        return video.size
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val pb: ProgressBar = itemView.findViewById(R.id.pb)

        fun setVideoData(mvideo: VideoData) {
            itemView.title.text = mvideo.videoTitle
            itemView.Desc.text = mvideo.videoDesc
            itemView.cImage.setImageResource(mvideo.pImage)
            itemView.videoView.setVideoPath(mvideo.videoUrl)

            itemView.videoView.setOnPreparedListener { mp ->
                pb.visibility = View.INVISIBLE
                mp.start()
                mp.isLooping = true

                val videoRatio = mp.videoWidth.toFloat() / mp.videoHeight.toFloat()
                val screenRatio =
                    itemView.videoView.width.toFloat() / itemView.videoView.height.toFloat()

                val scale = videoRatio / screenRatio
                if (scale >= 1f) {
                    itemView.videoView.scaleX = scale
                } else {
                    itemView.videoView.scaleY = (1f / scale)
                }
            }
            itemView.videoView.setOnCompletionListener {
                object : MediaPlayer.OnCompletionListener {
                    override fun onCompletion(mp: MediaPlayer) {
                        mp.start()
                        mp.isLooping = true
                    }
                }


            }
        }
    }
}


