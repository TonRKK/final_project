package com.example.tracking

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.GsonBuilder
import com.google.gson.JsonObject
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val gson = GsonBuilder()
                .setLenient()
                .create()

        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.etrackings.com")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()

        val trackingService = retrofit.create(TrackingService::class.java)
        val call = trackingService.getTrackingResponse(
                tracking_number = "BCST000141454",
                courier = "kerry_express"
        )
        call.enqueue(object : Callback<JsonObject> {
            override fun onResponse(
                    call: Call<JsonObject>, response: Response<JsonObject>
            ) {
                if (response.isSuccessful) {
                    tvPackageStatus.text = response.body().toString()
                } else {
                    tvPackageStatus.text = response.code().toString()
                }
            }

            override fun onFailure(call: Call<JsonObject>, t: Throwable) {
                tvPackageStatus.text = t.message
                Toast.makeText(applicationContext, t.message, Toast.LENGTH_SHORT).show()
            }
        })
    }
}
//https://api.etrackings.com/v2/tracks
//trackingNumber = "BCST000141454",
//carrierCode = "kerryexpress-th"
//https://api.trackingmore.com