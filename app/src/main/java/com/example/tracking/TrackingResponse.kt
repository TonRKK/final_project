package com.example.tracking

import com.google.gson.annotations.SerializedName

data class TrackingResponse(
//    @SerializedName("id") val id: String? = null,
//    @SerializedName("tracking_number") val trackingNumber: String? = null,
//    @SerializedName("carrier_code") val carrierCode: String? = null,
//    @SerializedName("order_create_time") val orderCreateTime: String? = null,
    @SerializedName("status") val status: String? = null
//    @SerializedName("created_at") val createdAt: String? = null,
//    @SerializedName("customer_email") val customerEmail: List<String>? = null,
//    @SerializedName("customer_name") val customerName: String? = null,
//    @SerializedName("order_id") val orderId: String? = null,
//    @SerializedName("comment") val comment: String? = null,
//    @SerializedName("title") val title: String? = null,
//    @SerializedName("logistic_channel") val logisticChannel: String? = null,
//    @SerializedName("destination") val destination: String? = null
)
