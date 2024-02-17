package com.example.wordskillsbank.data.network.api

import com.example.wordskillsbank.data.network.model.GetValuteModel
import retrofit2.http.GET
import retrofit2.http.Header

interface ValuteApi {
    @GET("api/v1/get_currencies")
    suspend fun getAllValutes(@Header("Authorization") token:String):List<GetValuteModel>
}