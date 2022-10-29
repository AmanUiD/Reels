package com.aman.messagingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.aman.messagingapp.Adapter.VideoAdapter
import com.aman.messagingapp.data.VideoData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var video = ArrayList<VideoData>()
    var videoAdapter: VideoAdapter ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        video.add(VideoData("https://assets.mixkit.co/videos/preview/mixkit-pineapple-sliced-on-a-yellow-background-10430-large.mp4","Picklers","A pineapple is a sweet tropical fruit with a tough leathery skin and spiky leaves on top.",R.drawable.pickler))
        video.add(VideoData("https://assets.mixkit.co/videos/preview/mixkit-flag-of-india-waving-vertically-42105-large.mp4","The Legend","The National Flag is a horizontal tricolour of India saffron (kesaria) at the top, white in the middle and India green at the bottom in equal proportion.", R.drawable.legend))
        video.add(VideoData("https://assets.mixkit.co/videos/preview/mixkit-portrait-of-a-fashion-woman-with-silver-makeup-39875-large.mp4","Rainbow Girl","Sparkling Mentioning the twinkle in someone's eyes makes them sound fun and lively.",R.drawable.rainbow))
        video.add(VideoData("https://assets.mixkit.co/videos/preview/mixkit-man-under-multicolored-lights-1237-large.mp4","Shaddy","It means fishing hook. And since everyone try to interpret what Eminem is saying, the simple message is, the alter ego, the demon, is calling himself",R.drawable.shady))
        video.add(VideoData("https://assets.mixkit.co/videos/preview/mixkit-tree-with-yellow-flowers-1173-large.mp4","Nature_Cool","Nature can refer to the general realm of living plants and animals, and in some cases to the processes associated with inanimate objects.",R.drawable.nature))
        video.add(VideoData("https://assets.mixkit.co/videos/preview/mixkit-abstract-video-of-a-man-with-heads-like-matrushka-32647-large.mp4","Illusion_tech"," an interpretation that contradicts objective “reality” as defined by general agreement.",R.drawable.illu))
        video.add(VideoData("https://assets.mixkit.co/videos/preview/mixkit-hands-holding-a-smart-watch-with-the-stopwatch-running-32808-large.mp4","The Bound","The most popular are “time is money” by Benjamin Franklin or “time is the most valuable thing a man can spend” by Theophrastus.",R.drawable.time))
        video.add(VideoData("https://assets.mixkit.co/videos/preview/mixkit-multicolor-frog-closing-its-eyes-closeup-shot-1468-large.mp4","Nature_Cool","Frogs have protruding eyes, no tail, and strong, webbed hind feet that are adapted for leaping and swimming",R.drawable.nature))
        video.add(VideoData("https://assets.mixkit.co/videos/preview/mixkit-under-a-peripheral-road-with-two-avenues-on-the-sides-34560-large.mp4","_s_s_k_k_y_","Beautiful time laps.",R.drawable.ab))
        video.add(VideoData("https://assets.mixkit.co/videos/preview/mixkit-man-doing-tricks-with-roller-skates-in-a-parking-lot-34553-large.mp4","John Doe","Kicks is a slang word for all shoes, although it is most often used to refer to sneakers.",R.drawable.alak))
        video.add(VideoData("https://assets.mixkit.co/videos/preview/mixkit-pop-rock-band-performing-a-song-5121-large.mp4","Elexendra","Music, art concerned with combining vocal or instrumental sounds for beauty of form or emotional expression.",R.drawable.elex))

        videoAdapter = VideoAdapter(video)
        videoRv.adapter = videoAdapter




    }
}