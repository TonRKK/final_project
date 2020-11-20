package com.example.tracking

import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.http.*

interface TrackingService {

    @POST("/find")
    fun getTrackingResponse(
        @Query("tracking_number") tracking_number: String,
        @Query("courier") courier: String,
        @Header("Content-Type") contentType: String = "application/json",
        @Header("etracking-api-key") apiKey: String = "1dbe5b17dc82c09b9f42bdc5ca5d1909b8466a07",
        @Header("etracking-key-secret") keySecret: String = "ac91776789e64e5fb854945d52ecf58b7a452f58b6639d58601022ee4b62786c3a33ac38ee4f929f7b9033aaf78a5b8c6d6210fc3168c29b30715d78abde6b9cae0c506c03ed341d6edf9a"
        //@Header("Trackingmore-Api-Key") apiKey: String = "39d1295d-92d9-42da-a063-ec3bcd240ba3"
    ): Call<JsonObject>
}
