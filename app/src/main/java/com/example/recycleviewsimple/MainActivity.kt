package com.example.recycleviewsimple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recycleviewsimple.databinding.ActivityMainBinding
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val fakeVideoData: Array<JSONObject> = arrayOf(
            JSONObject("{\"title\": \"An awesome video title\", \"channel\": \"ChannelName\", \"views\": \"6k views\", \"datePosted\": \"5 days ago\", \"duration\": \"05:00\"}"),
            JSONObject("{\"title\": \"Barcelona\", \"channel\": \"BarcaNews\", \"views\": \"3k views\", \"datePosted\": \"1 day ago\", \"duration\": \"19:02\"}"),
            JSONObject("{\"title\": \"El Chiringuito\", \"channel\": \"Jugones\", \"views\": \"10k views\", \"datePosted\": \" 3 days ago\", \"duration\": \"02:45\"}"),
            JSONObject("{\"title\": \"MisterSeitan\", \"channel\": \"Seitan\", \"views\": \"150k views\", \"datePosted\": \"2 month ago\", \"duration\": \"15:02\"}"),
            JSONObject("{\"title\": \"Mancuer\", \"channel\": \"Mancuer\", \"views\": \"254k views\", \"datePosted\": \"13 seconds ago\", \"duration\": \"10:80\"}")
        )

        binding.rvVideoYoutube.adapter = MainAdapter(fakeVideoData)
    }
}